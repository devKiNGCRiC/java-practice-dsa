import java.util.Scanner;

public class AreaSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Value : ");
        double radius = input.nextDouble();
        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.print("The Area Of Sphere is : " + area);
        input.close();
    }
}
