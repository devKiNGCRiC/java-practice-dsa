public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {8,3,6,2};
        int smallest = arr[0];
        for(int i=1; i<4;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        } 
        System.out.print("Smallest = " + smallest);
    }
}
