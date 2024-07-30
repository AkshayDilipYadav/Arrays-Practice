import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < N ; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(maxSumSubarray(N, A , B ));
    }

    public static int maxSumSubarray(int N, int[] A, int B){
        int currentSum = 0;
        int maxSum = 0;
        int start = 0;

        for(int e = 0; e < N; e++){
            currentSum += A[e];
            while(currentSum > B && start <= e){
                currentSum -= A[start];
                start++;
            }
            if(currentSum > maxSum){maxSum = currentSum;}
        }
        return maxSum;
    }

}