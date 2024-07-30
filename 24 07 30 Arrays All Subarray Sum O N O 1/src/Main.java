import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        System.out.println(allSubarraySum(A));

    }

    public static long allSubarraySum(int[] A){
        int N = A.length;
        long totalSum = 0;

        for(int i = 0; i < N; i++){
            long contribution = (long) A[i] * (i + 1) * (N - i);
            totalSum += contribution;
        }
        return totalSum;
    }
}