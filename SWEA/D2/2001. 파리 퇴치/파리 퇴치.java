import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] fly = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					fly[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i < n - m + 1; i++) {
				for (int j = 0; j < n - m + 1; j++) {
					int sum = 0;
					for (int p = 0; p < m; p++) {
						for (int q = 0; q < m; q++) {
							sum += fly[i + p][j + q];
						}
					}
					max = Math.max(max, sum);
				}
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}