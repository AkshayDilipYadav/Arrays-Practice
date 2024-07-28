import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
    for(int i = 0; i < N; i++ ) {
        A[i] = sc.nextInt();
    }

    List<List<Integer>> result = generateAllSubarray(A);

    for(List<Integer> subarray : result){System.out.println(subarray);}


    }

    public static List<List<Integer>> generateAllSubarray(int[] A){
        List<List<Integer>> subarrays = new ArrayList<>();

        int n = A.length;
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                List<Integer> subarray = new ArrayList<>();
                for(int k = s; k <= e; k++){subarray.add(A[k]);}
                subarrays.add(subarray);
            }
        }
        return subarrays;
    }


}