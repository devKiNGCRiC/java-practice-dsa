public class SearchElementArray {
    public static void main(String[] args) {
        int arr[] = {3,2,7,28,82,9,31,82};
        int Search = 28;
        for(int i = 0; i < 8; i++){
            if(Search == arr[i]){
                System.out.print("Search Element " + arr[i] + " Found At Index " + i);
            }
        }
    }
}
