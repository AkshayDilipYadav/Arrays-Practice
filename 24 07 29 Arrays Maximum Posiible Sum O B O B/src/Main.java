import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
         for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

         int B = sc.nextInt();

         int result = maxSumOperation(A, B);

         System.out.println(result);

    }

    public static int maxSumOperation(int[] A, int B){
        int n = A.length;

        int[] frontSum = new int[B + 1];
        int[] backSum = new int[B + 1];

        for(int i = 0; i < B; i++){
            frontSum[i + 1] = frontSum[i] + A[i];
        }

        for(int i = 0; i < B; i++){
            backSum[i + 1] = backSum[i] + A[n - 1 - i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= B; i++){
            int currentSum = frontSum[i] + backSum[B - i];
            if(currentSum > maxSum){maxSum = currentSum;}
        }
        return maxSum;


    }

}