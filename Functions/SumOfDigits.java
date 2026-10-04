import java.util.Scanner;

public class SumOfDigits {
    public int sumDigits(int n){
        if(n == 0){
            return 0;
        }else{
            return (n % 10) + sumDigits(n / 10);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        SumOfDigits sd = new SumOfDigits();
        System.out.print("The Sum of Digit of Number " + num + " is : " + sd.sumDigits(num));
        in.close();
    }
}
