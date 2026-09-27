import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = in.nextInt();
        System.out.print("The Number is : " + (((n&1) == 0) ? "Even" : "Odd"));
        in.close();
    }
}