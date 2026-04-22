import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Value : ");
        double radius = input.nextDouble();
        double volume = 4* (Math.PI * Math.pow(radius,3))/3;
        System.out.print("The Volume Of Sphere is : " + volume);
        input.close();
    }
}
