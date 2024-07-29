import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }

        List<Integer> result = findLeaders(A);
        System.out.println(result);

    }

    public static List<Integer> findLeaders(int[] A){
        List<Integer> leaders = new ArrayList<>();

        int n = A.length;

        if(n == 0){return leaders;}

        int maxFromRight = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(A[i] > maxFromRight){
                leaders.add(A[i]);
                maxFromRight = A[i];
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = leaders.size() - 1; i >= 0; i--){
            result.add(leaders.get(i));
        }
        return result;
    }


}