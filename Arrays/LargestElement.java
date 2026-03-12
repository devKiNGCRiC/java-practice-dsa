public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1};
        int largest = arr[0];
        for(int i = 1; i<4;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.print("Largest = " + largest);
    }
}
