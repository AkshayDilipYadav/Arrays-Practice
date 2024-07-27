import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i< N; i++){
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[][] q = new int[M][2];

        for(int i = 0; i< M; i++){
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
        }
        long[] result = getSum(A, q);

        for(long sum : result){System.out.println(sum);}


    }

    public static long[] getSum(int[] A, int[][] q){

        int N = A.length;
        int M = q.length;

        long[] prefixSum = new long[N];
        prefixSum[0] = A[0];
        for(int i =1; i< N; i++){
            prefixSum[i] = prefixSum[i - 1] + A[i];

        }

        long[] result = new long[M];

        for(int i = 0; i< M; i++){
            int L = q[i][0];
            int R = q[i][1];
            result[i] = (L > 0) ? (prefixSum[R] - prefixSum[L - 1]) : prefixSum[R];
        }
        return result;

    }



}