import java.util.Scanner;

public class FCFS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Processes : ");
        int n = sc.nextInt();

        int[] pid = new int[n];
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        for(int i = 0; i < n; i++){
            pid[i] = i + 1;
            System.out.print("Enter Arrival Time of P" + pid[i] + ": ");
            at[i] = sc.nextInt();
            System.out.print("Enter Burst Time of P" + pid[i] + ": ");
            bt[i] = sc.nextInt();
        }

        //FCFS Scheduling
        ct[0] = at[0] + bt[0];
        for(int i = 1; i < n; i++){
            ct[i] = Math.max(ct[i-1], at[i]) + bt[i];
        }

        float avgWT = 0 , avgTAT = 0;
        System.out.println("Process\t At\t Bt\t Ct\t Tat\t Wt\t");

        for (int i = 0; i < n; i++){
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
            avgWT += wt[i];
            avgTAT += tat[i];
            System.out.println("p" + pid[i] + "\t " + at[i] + "\t " + bt[i] + "\t " + ct[i] + "\t " + tat[i] + "\t " + wt[i]);
        }

        System.out.println("\nAverage Waiting Time = " + (avgWT/n));
        System.out.println("\nAverage Turnaround Time = " + (avgTAT/n));

        sc.close();
    }
}