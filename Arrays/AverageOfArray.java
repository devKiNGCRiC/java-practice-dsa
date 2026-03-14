public class AverageOfArray {
    public static void main(String[] args) {
        int arr[] = {64,2,28,82,8,88};
        int sum = 0;
        for(int i = 0 ; i < 6 ; i++){
            sum += arr[i];
        }
        float avg = (float)sum/6;
        System.out.print("Average : " + avg);
    }
}
