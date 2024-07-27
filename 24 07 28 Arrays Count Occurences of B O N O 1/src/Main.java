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

        int count = countOccurences(A, B);
        System.out.println(count);
    }
    public static int countOccurences(int[] A, int B){
        int count = 0;
        for(int i = 0; i< A.length; i++){
            if(A[i] == B){count++;}
        }
        return count;
    }
}