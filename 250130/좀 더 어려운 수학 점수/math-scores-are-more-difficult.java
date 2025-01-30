import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEng = sc.nextInt();

        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        char winner = 'A';

        if(aMath < bMath){
            winner = 'B';
        }else if(aMath == bMath){
            if(aEng < bEng){
                winner = 'B';
            }
        }

        System.out.println(winner);
    }
}