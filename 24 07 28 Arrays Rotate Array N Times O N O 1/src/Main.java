import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();

        rotateArray(A, B);
        for(int i = 0; i< n; i++ ){
            System.out.print(A[i] + " ");
        }
    }

    public static void rotateArray(int[] A, int B){
        int N = A.length;
        B = B % N;
        if(B == 0){return;}

        reverse(A, 0, N - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, N - 1);

    }

    public static void reverse(int[] A, int l, int r){
        while(l < r){
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
    }

}