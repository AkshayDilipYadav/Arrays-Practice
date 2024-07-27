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

        int[] rotatedArray = rotateArray(A, B);
        for(int i = 0; i< n; i++){
            System.out.print(rotatedArray[i] + " ");
        }
    }

    public static int[] rotateArray(int[] A, int B ){
        int N = A.length;
        B = B % N;

        if(B == 0){
            return A;
        }

        int[] rotatedArray = new int[N];

        for(int i = 0; i< B; i++){
            rotatedArray[i] = A[N - B + i];
        }

        for(int i =0; i< N - B; i++){
            rotatedArray[B + i] = A[i];
        }
        return rotatedArray;

    }
}