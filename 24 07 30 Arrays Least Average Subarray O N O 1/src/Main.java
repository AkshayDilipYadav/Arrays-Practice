import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(findMinAverageSubarray(A, B));
    }

    public static int findMinAverageSubarray(int[] A, int B){
        int N = A.length;
        int currentSum = 0;
        for(int i = 0; i < B; i++){currentSum += A[i];}
        int minSum = currentSum;
        int minIndex = 0;

        for(int i = B; i < N; i++){
            currentSum = currentSum - A[i - B] + A[i];
            if(currentSum < minSum){
                minSum = currentSum;
                minIndex = i - B + 1;
            }
        }
        return minIndex;
    }

}