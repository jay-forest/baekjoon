import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int rcnt = 1;
		int lcnt = 1;
		int max = 1;
		if (n > 1) {
			for (int i = 0; i < n - 1; i++) {
				if (nums[i] <= nums[i + 1]) {
					++rcnt;
					max = Math.max(max, rcnt);
				} else {
					rcnt = 1;
				}
				if (nums[n - 1 - i] <= nums[n - 2 - i]) {
					++lcnt;
					max = Math.max(max, lcnt);
				} else {
					lcnt = 1;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}