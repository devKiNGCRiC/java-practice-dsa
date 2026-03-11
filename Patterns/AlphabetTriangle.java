public class AlphabetTriangle {
    public static void main(String[] args) { 
        int n = 5;
        for(int i = 0; i < n; i++){
            char a = 'A';
            for(int j = 0; j < i+1 ; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
