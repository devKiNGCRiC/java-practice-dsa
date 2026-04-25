import java.util.Scanner;

public class AreaCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Value : ");
        double r = input.nextDouble();
        System.out.print("Enter The Height Value : ");
        double h = input.nextDouble();
        double area = (Math.PI*r)*(r+Math.sqrt(Math.pow(h, 2)+Math.pow(r,2)));
        System.out.print("The Area Of Cylinder is : " + area);
        input.close();
    }
}