import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i =0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[][] Q = new int[M][2];

        for(int i =0; i < M; i++){
            Q[i][0] = sc.nextInt();
            Q[i][1] = sc.nextInt();
        }
        int[] result = getEvenCount(A, Q);

        for(int count : result){System.out.println(count);}
    }

    public static int[] getEvenCount(int[] A, int[][] Q){
        int N = A.length;
        int M = Q.length;

        int[] prefixEven = new int[N];
        prefixEven[0] = (A[0] % 2 ==0) ? 1: 0;
        for(int i = 1; i < N; i++){
            prefixEven[i] = prefixEven[i - 1] + ((A[i] % 2 == 0) ? 1 : 0);
        }

        int[] result = new int[M];

        for(int i = 0; i < M; i++){
            int l = Q[i][0];
            int r = Q[i][1];

            if(l > 0){result[i] = prefixEven[r] - prefixEven[l -1];}
            else{result[i] = prefixEven[r];}

        }
        return result;

    }

}