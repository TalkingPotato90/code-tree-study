import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        check(a % 3 == 0 || a % 5 == 0);
    }

    private static void check(boolean b){
        int a = b ? 1 : 0;
        System.out.println(a);
    }
}