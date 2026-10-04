import java.util.Scanner;

public class Fibo{
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the end range of Fibonacci series (e.g., 5): ");
        int n = in.nextInt();
        System.out.print("Fibonacci series of first " + (n) + " is : ");
        for(int i = 0; i < n; i++){
            System.out.print(fibo(i) + " ");
        }
        in.close();
    } 
}