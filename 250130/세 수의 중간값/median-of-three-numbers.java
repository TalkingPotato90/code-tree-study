import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        check(b > a && b < c);
    }

    private static void check(boolean b){
        int a = b ? 1 : 0; 
        System.out.println(a);
    }
}