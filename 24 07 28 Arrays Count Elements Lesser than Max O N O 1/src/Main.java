import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i =0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int result = countElements(A);
        System.out.println(result);
    }

    public static int countElements(int[] A){
        if(A.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for(int value : A){
            if(value > max){max = value;}
        }
        int count = 0;
        for(int value : A){
            if(value < max){count++;}
        }
        return count;
    }
}