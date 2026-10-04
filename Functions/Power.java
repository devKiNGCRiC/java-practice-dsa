import java.util.Scanner;

public class Power {
    public int power(int n , int e){
        if(e == 0){
            return 1;
        }else{
            return n * power(n , e - 1);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        System.out.print("Enter the Exponent : ");
        int exp = in.nextInt();
        Power p = new Power();
        System.out.print("The Power of Number " + num + " is : " + p.power(num, exp));
        in.close();
    }
}
