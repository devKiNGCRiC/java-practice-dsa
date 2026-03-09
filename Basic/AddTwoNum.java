import java.util.Scanner;

public class AddTwoNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter 2nd Number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("\nThe Sum of" + num1 + " and " + num2 + " is : " + sum);
    }
}