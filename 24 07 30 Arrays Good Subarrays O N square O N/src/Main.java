import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();

        }

        int B = sc.nextInt();
        System.out.println(goodSubarrays(A, B));
    }

    public static int goodSubarrays(int[] A, int B){
        int N = A.length;

        int count = 0;

        int[] prefix = new int[N];
        prefix[0] = A[0];
        for(int i = 1; i < N; i++){
            prefix[i] = prefix[i - 1] + A[i];
        }

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int sum = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
                int length = j - i + 1;
                if((length % 2 == 0 && sum < B) || (length % 2 == 1 && sum > B)){
                    count++;
                }
            }
        }
        return count;


    }

}
