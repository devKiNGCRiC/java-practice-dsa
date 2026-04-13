class Task {
    String name;
    int period;
    int execTime;
    int remaining;

    Task(String n, int p, int e) {
        name = n;
        period = p;
        execTime = e;
        remaining = 0;
    }
}

public class RMS {
    public static void main(String[] args) {

        Task t1 = new Task("T1", 2, 1);
        Task t2 = new Task("T2", 4, 2);
        Task t3 = new Task("T3", 6, 2);

        Task[] tasks = {t1, t2, t3};

        int simTime = 12;

        for (int time = 0; time < simTime; time++) {

            // Release tasks periodically
            for (Task t : tasks)
                if (time % t.period == 0)
                    t.remaining = t.execTime;

            // Pick highest priority (smallest period)
            Task run = null;
            for (Task t : tasks)
                if (t.remaining > 0 && (run == null || t.period < run.period))
                    run = t;

            // Execute
            if (run != null) {
                System.out.println("Time " + time + " -> " + run.name);
                run.remaining--;
            } else
                System.out.println("Time " + time + " -> Idle");
        }
    }
}