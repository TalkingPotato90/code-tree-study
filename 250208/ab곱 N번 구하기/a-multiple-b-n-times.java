import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int multiple = 1;
            for(int j = a; j <= b; j++){
                multiple *= j;
            }
            System.out.println(multiple);
        }
    }
}