import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0 ; i< N; i++){
            A[i] = sc.nextInt();
        }
        int result = findSecondLargest(A);
        System.out.println(result);
    }

    public static int findSecondLargest(int[] A){
        if(A.length < 2){return -1;}
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int value : A){
            if(value > largest){
                secondLargest = largest;
                largest = value;
            }
            else if(value > secondLargest && value < largest){secondLargest = value;}
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

}