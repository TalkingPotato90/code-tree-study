import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double avg = sc.nextDouble();
        String result;

        if(avg > 1.0){
            result = "High";
        }else if(avg > 0.5){
            result = "Middle";
        }else{
            result = "Low";
        }

        System.out.println(result);
    }
}