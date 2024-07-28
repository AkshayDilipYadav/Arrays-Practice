import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int result = findEquilibriumIndex(A);
        System.out.println(result);
    }

    public static int findEquilibriumIndex(int[] A){
        int totalSum = 0;

        for(int num : A){
            totalSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < A.length; i++){
            totalSum -= A[i];
            if(leftSum == totalSum){return i;}
            leftSum += A[i];
        }
        return -1;
    }
}