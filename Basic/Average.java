import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        int num1 , num2 , num3;
        double avg;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Three Numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        avg = (double)((num1 + num2 + num3)/3);

        System.out.println("The Average of Three Numbers is : " + avg);
    }
}
