import java.util.Scanner;

public class Swap {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt(); 
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2; 
        System.out.print("Number 1 after Swap : " + (num1 = (num1 ^ num2)));
        System.out.print("\nNumber 2 after Swap : " + num2);
        in.close();
    }
}
