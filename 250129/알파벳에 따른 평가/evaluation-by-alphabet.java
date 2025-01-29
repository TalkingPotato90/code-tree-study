import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        String result = "Failure";

        if(c == 'S'){
            result = "Superior";
        }else if( c == 'A'){
            result = "Excellent";
        }else if(c == 'B'){
            result ="Good";
        }else if(c == 'C'){
            result = "Usually";
        }else if(c == 'D'){
            result = "Effort";
        }

        System.out.println(result);
    }
}