import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        check(a >= b);
        check(a > b);
        check(b >= a);
        check(b > a);
        check(a == b);
        check(a != b);
    }

    private static void check(boolean b){
        int a = b ? 1 : 0;
        System.out.println(a);
    }
}