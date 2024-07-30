import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for(int i =0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int mainDiagonalSum = calculateDiagonalSum(matrix, N);
        System.out.println(mainDiagonalSum);

    }
    public static int calculateDiagonalSum(int[][] matrix, int N){
        int sum = 0;
        for(int i = 0; i < N; i++){sum += matrix[i][i];}
        return sum;
    }
}