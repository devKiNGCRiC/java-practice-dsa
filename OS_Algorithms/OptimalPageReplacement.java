import java.util.*;

public class OptimalPageReplacement {
    public static void main(String[] args) {
        int[] pages = {7, 0, 1, 2, 0, 3, 0, 4};
        int frames = 3;

        ArrayList<Integer> frame = new ArrayList<>();
        int faults = 0;

        for (int i = 0; i < pages.length; i++) {
            if (!frame.contains(pages[i])) {
                faults++;

                if (frame.size() < frames) {
                    frame.add(pages[i]);
                } else {
                    int farthest = i;
                    int index = -1;

                    for (int j = 0; j < frame.size(); j++) {
                        int k;
                        for (k = i + 1; k < pages.length; k++) {
                            if (frame.get(j) == pages[k]) {
                                if (k > farthest) {
                                    farthest = k;
                                    index = j;
                                }
                                break;
                            }
                        }
                        if (k == pages.length) {
                            index = j;
                            break;
                        }
                    }
                    frame.set(index, pages[i]);
                }
            }
            System.out.println("Frames after page " + pages[i] + ": " + frame);
        }
        System.out.println("Total Page Faults: " + faults);
    }
}