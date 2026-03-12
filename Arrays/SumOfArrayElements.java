public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int sum = 0;
        for(int i = 0 ; i<4;i++){
            sum += arr[i];
        }
        System.out.print("Sum = " + sum);
    }
}
