import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.next().charAt(0);
        int c = sc.nextInt();
        int d = sc.next().charAt(0);

        if((a >= 19 || c >= 19) && (b == 'M' || d == 'M')){
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}