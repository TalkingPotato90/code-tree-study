import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tryCount = 0;

        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n *= 3;
                n++;
            }
            tryCount++;
        }

        System.out.println(tryCount);
    }
}