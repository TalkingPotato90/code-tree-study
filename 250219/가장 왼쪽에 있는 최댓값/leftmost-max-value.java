import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i + 1;
            }
        }

        System.out.print(maxIdx + " ");

        while(maxIdx > 1){
            max = Integer.MIN_VALUE;
            int tmpIdx = 0;

            for (int i = 0; i < maxIdx - 1; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    tmpIdx = i + 1;
                }
            }

            System.out.print(tmpIdx + " ");
            maxIdx = tmpIdx;
        }
    }
}