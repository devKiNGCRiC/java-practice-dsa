import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Length Value : ");
        double length = input.nextDouble();
        double area = length * length;
        System.out.print("The Area Of Square is : " + area);
        input.close();
    }
}
