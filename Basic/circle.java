import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        double radius ;
        double area , perimeter;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Radius Value : ");
        radius = in.nextFloat();

        area = Math.PI*(radius*radius);
        System.out.println("Area of Circle is : " + area);

        perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of the Circle : " + perimeter);
    }
}
