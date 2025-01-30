import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int mid = sc.nextInt();
        int end = sc.nextInt();

        int money = 0;

        if(mid >= 90){
            if(end >= 95){
                money = 100_000;
            }else if(end >= 90){
                money = 50_000;
            }
        }

        System.out.println(money);
    }
}