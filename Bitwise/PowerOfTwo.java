import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int num = in.nextInt();
        System.out.print(((num & (num-1)) == 0 ? "Yes!" : "No!") + " The Number is"+ ((num & (num-1)) == 0 ? "" : " Not a ") + "Power of Two.");
        in.close();
    }
}
