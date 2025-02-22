import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 500 && arr[i] > max){
                max = arr[i];
            }
            if(arr[i] > 500 && arr[i] < min){
                min = arr[i];
            }
        }

        System.out.printf("%d %d", max, min);
    }
}