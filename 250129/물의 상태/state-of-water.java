import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int degree = sc.nextInt();
        String result;

        if(degree < 0 ){
            result = "ice";
        }else if(degree >= 100){
            result = "vapor";
        }else{
            result = "water";
        }

        System.out.println(result);
    }
}