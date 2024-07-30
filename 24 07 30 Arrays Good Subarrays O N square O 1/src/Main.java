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

for(int i = 0; i < N; i++){
    int sum = 0;
    for(int j = i; j < N; j++){
        sum += A[j];
        int length = j - i + 1;
        if((length % 2 == 0 && sum < B) || (length % 2 == 1 && sum > B)){
            count++;
        }
    }
}
return count;
    }


}