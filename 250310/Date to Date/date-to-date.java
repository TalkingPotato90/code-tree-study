import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int result = 1;

        while(true){
            if(coins[0] == coins[2] && coins[1] == coins[3]){
                break;
            }

            coins[1]++;
            result++;

            if(coins[1] > days[coins[0]]){
                coins[0]++;
                coins[1] = 1;
            }
        }

        System.out.println(result);
    }
}