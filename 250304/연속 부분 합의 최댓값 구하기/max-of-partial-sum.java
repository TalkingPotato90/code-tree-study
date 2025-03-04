import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = nums[0];
        int cur = nums[0];

        for(int i = 1; i < n; i++){
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }

        System.out.println(max);
    }
}