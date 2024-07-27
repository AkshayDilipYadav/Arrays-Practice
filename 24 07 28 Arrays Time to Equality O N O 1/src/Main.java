import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i =0; i< n; i++){
            a[i] = sc.nextInt();
        }
        long minTime = calculateMinTime(a);
        System.out.println(minTime);
    }

    public static long calculateMinTime(int[] A){
        int max = Integer.MIN_VALUE;
        long totalIncrement = 0;
        for(int value : A){
            if(value > max){max = value;}
        }
        for(int value : A){totalIncrement += max - value;}
        return totalIncrement;
    }

}