import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int j = a; j <= b; j+=2){
                if(a % 2 == 0){
                    sum += j;
                }else{
                    sum += j+1;
                }
            }
            System.out.println(sum);
        }
    }
}