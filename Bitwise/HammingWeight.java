import java.util.Scanner;

public class HammingWeight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        int count = 0;
        while (n>0){
            count = count + (n%2);
            n/=2;
        } 
        System.out.println(count);
        in.close();
    }
}