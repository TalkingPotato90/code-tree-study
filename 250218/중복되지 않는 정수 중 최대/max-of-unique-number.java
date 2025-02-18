import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            boolean isDup = false;
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                    isDup = true;
                }
            }
            if(isDup){
                arr[i] = -1;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}