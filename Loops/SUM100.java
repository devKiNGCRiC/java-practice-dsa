//TO SUM ALL THE NUMBERS FROM 1 TO 100 USING LOOPS

public class SUM100 {
    public static void main(String args[]){
        int num1 = 1;
        int num2 = 100;
        int sum = 0;
        System.out.print("The Sum of All Numbers From 1 to 100 is : ");

        for(int i=num1; i<=num2; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
