import java.util.Scanner;
import java.util.Arrays;
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
        Arrays.sort(A);
        int l = 0;
        int r = A.length -1;
        while(l<r){
            int sum = A[l] + A[r];
            if(sum == B){return 1;}
            if(sum < B){l++;}
            if(sum > B){r--;}
        }
        return 0;
    }
}