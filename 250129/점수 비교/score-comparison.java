import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEng = sc.nextInt();

        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        if(aMath > bMath && aEng > bEng){
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}