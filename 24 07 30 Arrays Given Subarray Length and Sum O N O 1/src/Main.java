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
        int C = sc.nextInt();

        System.out.println(subarrayLengthSUm(A, B, C));

    }

    public static int subarrayLengthSUm(int[] A, int B, int C){
        int N = A.length;

        int currentSum = 0;

        for(int i = 0; i < B; i++){
            currentSum += A[i];
        }
        if(currentSum == C){return 1;}

        for(int i = B; i < N; i++){
            currentSum += A[i] - A[i - B];
            if(currentSum == C){return 1;}
        }
        return 0;

    }

}