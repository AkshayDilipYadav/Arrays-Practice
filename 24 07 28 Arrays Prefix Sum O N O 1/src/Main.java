import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i =0; i< N; i++){
            A[i] = sc.nextInt();
        }
        computePrefixSum(A);
        StringBuilder result = new StringBuilder();
        for(int num : A){
            result.append(num).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    public static void computePrefixSum(int[] A){
        for(int i = 1; i < A.length; i++){
            A[i] += A[i-1];
        }
    }
}