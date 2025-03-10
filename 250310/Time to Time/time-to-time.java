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
        int count = 0;
        while(true){
            coins[1]++;
            count++;
            if(coins[1] == 60){
                coins[1] = 0;
                coins[0]++;
            }

            if(coins[0] == coins[2] && coins[1] == coins[3]){
                break;
            }
        }

        System.out.println(count);
    }
}