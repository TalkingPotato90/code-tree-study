import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int day;
        if(n <= 7){
            if(n == 2){
                day = 28;
            }else if(n % 2 == 0){
                day = 30;
            }else{
                day = 31;
            }
        }else{
            if(n % 2 == 0){
                day = 31;
            }else{
                day = 30;
            }
        }

        System.out.println(day);
    }
}