import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){matrix[i][j] = sc.nextInt();}

        }
        int[] columnSum = colSum(matrix, r, c);
        for(int sum : columnSum){
            System.out.print(sum + " ");}

    }

    public static int[] colSum(int[][] matrix, int r, int c){
        int[] columnSum = new int[c];
        for(int j = 0; j < c; j++){
            for(int i = 0; i < r; i++){
                columnSum[j] += matrix[i][j];
            }
        }
        return columnSum;
    }

}