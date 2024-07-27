import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int result = hasGoodPair(A, B);
        System.out.println(result);
    }

    public static int hasGoodPair(int[] A, int B) {
        for(int i = 0 ; i< A.length; i++){
            for(int j = i+ 1; j < A.length; j++){
                if(A[i] + A[j] == B){return 1;}
            }

        }
        return 0;
    }
}