import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        check(a > b);
        check(a > c);
        check(a > d);
        check(a > e);
    }

    private static void check(boolean b){
        int a = b ? 1 : 0;
        System.out.println(a);
    }
}