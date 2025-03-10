import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] count = new int[102];
       
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            count[x1]++;
            count[x2 + 1]--;
        }

        int maxOverlap = 0;
        int currentOverlap = 0;

        for (int i = 1; i <= 100; i++) {
            currentOverlap += count[i];
            maxOverlap = Math.max(maxOverlap, currentOverlap);
        }

        System.out.println(maxOverlap);
    }
}
