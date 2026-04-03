public class Swap {
    public static void main(String[] args){
        int num1 = 28;
        int num2 = 82;

        System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping :-"+"\nNumber 1 : " + num1 + "\nNumber 2 : " + num2);
    }
}
