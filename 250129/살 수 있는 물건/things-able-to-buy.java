import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        String product;

        if(money >= 3000){
            product = "book";
        }else if(money >= 1000){
            product = "mask";
        }else{
            product = "no";
        }

        System.out.println(product);
    }
}