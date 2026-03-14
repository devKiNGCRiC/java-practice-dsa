public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,8,22,28,82,88};
        int rev[];
        rev = new int[6];
        System.out.print("Input : ");
        for(int j = 0; j < 6; j++){
            System.out.print( arr[j] + " "); 
        }
        System.out.println();
        System.out.print("Output : " );
        for(int i = 5, j = 0; i >= 0; i--,j++){
            rev[j] = arr[i];
            System.out.print(rev[j] + " ");
        }
        
    }
}
