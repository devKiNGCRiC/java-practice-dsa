public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[] = {5,9,48,82,3,54,28,7};
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < 8; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print("Even : " + even);
        System.out.print("\nOdd : " + odd);
    }
}
