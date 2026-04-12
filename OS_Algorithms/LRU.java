import java.util.*;

public class LRU {
    public static void main(String[] args) {
        int[] pages = {1,2,3,4,1,2,5,1,2,3,4,5};
        int frames = 3;
        lruPageReplacement(pages,frames);
    }

    public static void lruPageReplacement(int[] pages, int frames) {
        List<Integer> memory = new ArrayList<>();
        int pageFaults = 0;
        for(int page: pages){
            if(!memory.contains(page)){
                if(memory.size() == frames){
                    memory.remove(0);
                }
                memory.add(page);
                pageFaults++;
            }else{
                memory.remove((Integer)page);
                memory.add(page);
            }
            System.out.println("Memory : " + memory);
        }
        System.out.println("Total Page Faults : " + pageFaults);
    }
}
