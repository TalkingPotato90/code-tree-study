import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + 100;
            y1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;
            y2[i] = sc.nextInt() + 100;
        }
        // Please write your code here.
        int[][] arr = new int[210][210];

        for(int a = 0; a < n; a++){
            for(int i = x1[a]; i < x2[a]; i++){
                for(int j = y1[a]; j < y2[a]; j++){
                    arr[i][j] = 1;
                }
            }
        }

        int total =0;

        for(int i = 0; i < 210; i++){
            for(int j = 0; j < 210; j++){
                if(arr[i][j] == 1){
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}