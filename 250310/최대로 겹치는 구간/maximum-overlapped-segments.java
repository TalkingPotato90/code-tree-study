import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[210];
        // Please write your code here.
        for(int i = 1; i <= n; i++){
            int start = sc.nextInt() + 100;
            int end = sc.nextInt() + 100;
            for(int j = start-1; j < end-1; j++){
                arr[j]++;
            }
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}