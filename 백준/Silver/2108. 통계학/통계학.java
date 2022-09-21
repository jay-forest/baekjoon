import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + nums[i];
		}
		int max = 1;
		int cnt = 1;
		int mode = nums[0];
		boolean dual = false;
		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[i - 1]) {
				cnt++;
			} else cnt = 1;
			if (cnt > max) {
				max = cnt;
				mode = nums[i];
				dual = false;
			} else if (cnt == max && !dual) {
				mode = nums[i];
				dual = true;
			}
		}
		System.out.println(Math.round(sum / n));
		System.out.println(nums[n / 2]);
		System.out.println(mode);
		System.out.println(nums[n - 1] - nums[0]);
		sc.close();
	}
}