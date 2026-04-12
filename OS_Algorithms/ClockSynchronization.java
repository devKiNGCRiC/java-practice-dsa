import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClockSynchronization {
    private static List<Integer> clocks = new ArrayList<>(Arrays.asList(10,20,30));
    public static void main(String[] args) {
        System.out.println("Initial Clocks");
        printClocks();
        int sum = 0;
        for(int time : clocks){
            sum += time;
        }
        int average = sum/clocks.size();
        System.out.println("Average time calculated by master : " + average);

        for(int i = 0; i < clocks.size() ; i++){
            int adjustment = average - clocks.get(i);
            clocks.set(i, clocks.get(i) + adjustment);
            System.out.println("Clock" + (i+1) + "adjusted by " + adjustment);
        }
        System.out.println("\nSynchronized Clocks");
        printClocks();
    }
    private static void printClocks(){
        for(int i = 0; i < clocks.size(); i++){
            System.out.println("Clock "+ (i+1) + ": " + clocks.get(i) + "s");
        }
    }
}