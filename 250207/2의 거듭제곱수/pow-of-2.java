import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while( n != 2 ){
            n /= 2;
            i++;
        }

        System.out.println(i);

    }
}