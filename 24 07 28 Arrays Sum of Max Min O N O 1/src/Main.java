import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int result = findSumOfMaxMin(A);
        System.out.println(result);
    }

    public static int findSumOfMaxMin(int[] A){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i< A.length; i++){
            if(A[i] > max){max = A[i];}
            if(A[i] < min){min = A[i];}

        }
        return max + min;
    }

}