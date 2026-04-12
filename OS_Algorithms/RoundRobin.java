import java.util.Scanner;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of processes : ");
        int n = input.nextInt();
        
        int[] pid = new int[n];
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] rembt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        for(int i = 0; i < n ; i++){
            pid[i] = i + 1;

            System.out.print("Enter Arrival Time of P" + pid[i] + " : ");
            at[i] = input.nextInt();
            System.out.print("Enter Burst Time of P" + pid[i] + " : ");
            bt[i] = input.nextInt();
            rembt[i] = bt[i];
        }

        System.out.print("Enter Time Quantum : ");
        int timeQuantum = input.nextInt();

        int time = 0;
        boolean done;

        do{
            done = true;
            for(int i = 0; i < n ; i++){
                if(rembt[i] > 0 && at[i] <= time){
                    done = false;
                    if(rembt[i] > timeQuantum){
                        time += timeQuantum;
                        rembt[i] -= timeQuantum;
                    }else{
                        time += rembt[i];
                        ct[i] = time;
                        rembt[i] = 0;
                    }
                }
            }
        }while(!done);

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
    }
}