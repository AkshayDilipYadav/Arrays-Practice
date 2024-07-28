import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i< N; i++){
            A[i] = sc.nextInt();
        }

        int result = smallestSubarrayWithMaxMin(A);
        System.out.println("Length of Subarray : " + result);

     }

     public static int smallestSubarrayWithMaxMin(int[] A){
        int n = A.length;
        if(n == 0){return 0;}
        int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;

        for(int i =0; i < n; i++){
            if(A[i] < min){min = A[i];}
            if(A[i] > max){ max = A[i];}
        }

        if(min == max){return 1;}

        int minIndex = -1;
        int maxIndex = -1;
        int minLength = n;

        for(int i = 0; i < n; i++){
            if(A[i] == min){
                minIndex = i;
                if(maxIndex != -1){minLength = Math.min(minLength, i - maxIndex + 1);}
            }
            if(A[i] == max){
                maxIndex = i;
                if(minIndex != -1){
                    minLength = Math.min(minLength, i - minIndex + 1);
                }
            }
        }
        return minLength;

     }
}