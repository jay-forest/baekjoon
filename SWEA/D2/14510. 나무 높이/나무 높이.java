import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[] tree = new int[n];
			int[] dt = new int[n];
			int maxtree = -1;
			for (int i = 0; i < n; i++) {
				tree[i] = sc.nextInt();
				maxtree = Math.max(tree[i], maxtree);
			}
			int sum = 0;
			int oddcnt = 0;
			int evensum = 0;
			for (int i = 0; i < n; i++) {
				dt[i] = maxtree - tree[i];
				sum += dt[i];
				if (dt[i] % 2 == 1) {
					oddcnt++;
				}
				evensum += (dt[i] / 2);
			}

			int mindays = 0;

			if (oddcnt > evensum + 1) {
				mindays = evensum * 2 + (oddcnt - evensum) * 2 - 1;
			} else {
				mindays = (sum / 3) * 2 + sum % 3;
			}
			System.out.printf("#%d %d\n", tc, mindays);

		}
	}
}
