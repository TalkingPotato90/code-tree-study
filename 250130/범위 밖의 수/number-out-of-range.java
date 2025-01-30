import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean b = a < 10 || a > 20;

        String result = b ? "yes" : "no";

        System.out.println(result);
    }
}