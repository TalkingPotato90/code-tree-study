import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt();
            if(temp > max){
                max = temp;
            }
        }

        System.out.println(max);
    }
}