import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Value : ");
        double r = input.nextDouble();
        System.out.print("Enter The Height Value : ");
        double h = input.nextDouble();
        double volume = Math.PI*Math.pow(r, 2)*(h/3);
        System.out.print("The Area Of Cylinder is : " + volume);
        input.close();
    }
}