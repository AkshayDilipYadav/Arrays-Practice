import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int result = countUniqueSubarray(A);
        System.out.println(result);

    }

    public static int countUniqueSubarray(int[] A) {
        int n = A.length;

        int mod = 1000000007;

        Set<Integer> set = new HashSet <>();

        int l = 0;
        int count = 0;

        for(int r = 0; r < n; r++){
            while(set.contains(A[r])){
                set.remove(A[r]);
                l++;
            }
            set.add(A[r]);
            count += (r - l + 1);
            count %= mod;
        }
        return (int) count;
    }

}