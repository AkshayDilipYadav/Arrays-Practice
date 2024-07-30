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
        System.out.println(subarraySumLessThanB(A, B));


    }
    public static int subarraySumLessThanB(int[] A, int B){
        int N = A.length;
        int start = 0;
        int currentSum = 0;
        int count = 0;

        for(int e = 0; e < N; e++){
            currentSum += A[e];
            while(currentSum >= B && start <= e){
                currentSum -= A[start];
                start++;
            }
            count += (e - start + 1);
        }
return count;
    }

}