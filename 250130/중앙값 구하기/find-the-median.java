import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a < c || a < b && a > c){
            System.out.println(a);
        }

        if(b > a && b < c || b < a && b > c){
            System.out.println(b);
        }

        if(c > b && c < a || c < b && c > a){
            System.out.println(c);
        }
    }
}