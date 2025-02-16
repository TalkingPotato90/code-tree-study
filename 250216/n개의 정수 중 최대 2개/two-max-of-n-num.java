import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        int sec = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= max){
                max = arr[i];
                maxIdx = i;
            }
        }

        for(int i = 0 ; i < n; i++){
            if(i == maxIdx){
                continue;
            }
            if(arr[i] >= sec){
                sec = arr[i];
            }
        }

        System.out.printf("%d %d", max, sec);
    }
}