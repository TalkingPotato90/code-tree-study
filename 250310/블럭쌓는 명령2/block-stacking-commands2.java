import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        // Please write your code here.
        for(int i = 1; i <= k; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start-1; j <= end-1; j++){
                arr[j]++;
            }
        }

        int max = arr[0];

        for(int i = 1; i < n; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}