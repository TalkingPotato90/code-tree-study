import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int count = 0;
            int n = sc.nextInt();
            while(true){
                if(n == 1){
                    break;
                }

                if(n % 2 == 0){
                    n /= 2;
                }else{
                    n *= 3;
                    n++;
                }

                count++;
            }
            System.out.println(count);
        }
    }
}