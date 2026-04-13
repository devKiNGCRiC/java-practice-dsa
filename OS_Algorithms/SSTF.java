import java.util.*;

public class SSTF {
    public static void main(String[] args) {
        int[] requests = {82, 170, 43, 140, 24, 16, 190};
        int head = 50;
        System.out.println("Initial Head Position : " + head);
        int totalSeek = 0;

        boolean[] visited = new boolean[requests.length];
        System.out.println("\nSSTF Disk Scheduling Order : ");
        System.out.print(head);
        for (int i = 0; i < requests.length; i++) {
            int minDist = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < requests.length; j++) {
                if (!visited[j]) {
                    int dist = Math.abs(head - requests[j]);
                    if (dist < minDist) {
                        minDist = dist;
                        index = j;
                    }
                }
            }

            visited[index] = true;
            totalSeek += minDist;
            head = requests[index];
            System.out.print("-> " + head);
        }

        System.out.println("\nTotal Seek Time: " + totalSeek);
    }
}