import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int result = maxProfit(A);
        System.out.println(result);

    }

    public static int maxProfit(int[] A){
        if(A == null || A.length == 0){return 0;}

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : A){
            if(price < minPrice){minPrice = price;}
            else if (price - minPrice > maxProfit){maxProfit = price - minPrice;}
        }
        return maxProfit;

    }

}