import java.util.Scanner;

public class AreaCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Value : ");
        double r = input.nextDouble();
        System.out.print("Enter The Height Value : ");
        double h = input.nextDouble();
        double area = (2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2));
        System.out.print("The Area Of Cylinder is : " + area);
        input.close();
    }
}
