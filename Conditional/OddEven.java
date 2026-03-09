import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        if(num%2 == 0){
            System.out.print("The Number " + num + " is Even");
        }else{
            System.out.print("The Number " + num + " is Odd");
        }
    }
}
