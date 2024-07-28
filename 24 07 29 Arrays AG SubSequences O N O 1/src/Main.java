import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        int result = countAGSubsequences(A);

        System.out.println(result);

    }

    public static int countAGSubsequences(String A) {

        int mod = 1000000007;
        int countA = 0;
        int countAG = 0;

        for (char ch : A.toCharArray()) {
            if (ch == 'A') {
                countA++;
            } else if (ch == 'G') {
                countAG = (countAG + countA) % mod;
            }

        }
        return countAG;
    }

}


