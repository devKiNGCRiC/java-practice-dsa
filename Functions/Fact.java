import java.util.Scanner;

public class Fact{
    public int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of which Factorial need to be find : ");
        int n = in.nextInt();
        Fact f = new Fact();
        System.out.print("The Factorial of " + n + " is : " + f.factorial(n));
        in.close();
    }
}