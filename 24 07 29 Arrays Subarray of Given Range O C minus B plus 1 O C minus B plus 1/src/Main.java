import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] subarray = getSubarray(A, B, C);

        System.out.println(Arrays.toString(subarray));
     }

     public static int[] getSubarray(int[] A, int B, int C){
        int subarrayLength = C - B + 1;
        int[] subarray = new int[subarrayLength];

        for(int i =0; i< subarrayLength; i++){
            subarray[i] = A[B + i];
        }
        return subarray;
     }

}