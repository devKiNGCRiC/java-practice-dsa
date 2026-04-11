class RealTimeThread extends Thread{
    public void run(){
        try{
            for(int i = 1; i <= 5 ; i++){
                System.out.println("Real-Time Task Running: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted");
        }
    }
}

public class Posix {
    public static void main(String[] args) {
        RealTimeThread rt = new RealTimeThread();
        rt.setPriority(Thread.MAX_PRIORITY);
        rt.start();
    }    
}
