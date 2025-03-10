import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] visited = new int[2001];
        int pos = 1000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j = 0; j < x; j++) {
                    visited[pos]++;
                    pos--;
                }
            } else {
                for (int j = 0; j < x; j++) {
                    visited[pos]++;
                    pos++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}