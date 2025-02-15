import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == min){
                count++;
            }
        }

        System.out.printf("%d %d",min,count);
    }
}