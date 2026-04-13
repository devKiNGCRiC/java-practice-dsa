public class DistributedScheduling {
    public static void main(String[] args) {
        int tasks = 5;
        int nodes = 3;

        int currentNode = 1;

        for (int i = 1; i <= tasks; i++) {
            System.out.println("Assigning Task " + i + " to Node " + currentNode);
            System.out.println("Task " + i + " Started");

            // Simulate completion of previous task
            if (i > 1) {
                System.out.println("Task " + (i - 1) + " Completed");
            }

            // Move to next node (Round Robin)
            currentNode++;
            if (currentNode > nodes) {
                currentNode = 1;
            }
        }

        // Last task completion
        System.out.println("Task " + tasks + " Completed");
    }
}