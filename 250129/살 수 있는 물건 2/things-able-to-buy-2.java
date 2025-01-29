import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        String product = "no";

        if (money >= 3000){
            product = "book";
        }else if(money >= 1000){
            product = "mask";
        }else if(money >= 500){
            product = "pen";
        }

        System.out.println(product);
    }
}