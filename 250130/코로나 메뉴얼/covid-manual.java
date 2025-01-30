import java.util.Scanner;

public class Main {
    static int e = 0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        int d1 = sc.nextInt();
        char c2 = sc.next().charAt(0);
        int d2 = sc.nextInt();
        char c3 = sc.next().charAt(0);
        int d3 = sc.nextInt();

        checkEmer(c1,d1);
        checkEmer(c2,d2);
        checkEmer(c3,d3);

        if(e >= 2){
            System.out.println("E");
            return;
        }
        System.out.println("N");
    }

    private static void checkEmer(char c, int a){
        if(c == 'Y' && a >= 37){
            e++;
        }
    }
}