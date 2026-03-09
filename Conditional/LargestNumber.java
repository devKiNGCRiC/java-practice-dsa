import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.print(num1 + " is Larger");
        }else{
            System.out.print(num2 + " is Larger");
        }
    }
}
