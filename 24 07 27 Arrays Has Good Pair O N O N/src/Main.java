import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int result = hasGoodPair(A, B);
        System.out.println(result);
    }

    public static int hasGoodPair(int[] A, int B) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : A){
            if(seen.contains(B - num)){return 1;}
            seen.add(num);
        }
        return 0;
    }
}