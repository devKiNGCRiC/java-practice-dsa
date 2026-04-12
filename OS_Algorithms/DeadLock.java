public class DeadLock {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread T1 = new Thread(() -> {
            synchronized(lock1){
                System.out.println("Thread 1 : Holding lock1...");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
                System.out.println("Thread 1: Waiting for lock2...");
                synchronized(lock2){
                    System.out.println("Thread 1: Acquired lock2...");
                }
            }
        });

        Thread T2 = new Thread(() -> {
            synchronized(lock2){
                System.out.println("Thread 2: Holding Lock2...");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
                System.out.println("Thread 2: Waiting for lock1...");
                synchronized(lock1){
                    System.out.println("Thread 2: Acquired lock1...");
                }
            }
        });
        T1.start();
        T2.start();
    }
}
