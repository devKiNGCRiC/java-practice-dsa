import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int reverse = 0;
        for(int i = 0 ; i <= num+1 ; i++){
            int remainder = num%10;
            reverse = remainder + reverse*10;
            num = num/10;
        }
        System.out.print(reverse);
    }
}
