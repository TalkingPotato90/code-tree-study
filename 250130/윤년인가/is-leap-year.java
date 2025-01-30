import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.println(!(y % 4 != 0 || y % 100 == 0 && y % 400 !=0));
    }
}