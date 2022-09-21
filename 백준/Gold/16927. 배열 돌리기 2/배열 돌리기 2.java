import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int[][] map = new int[n][m];
		int[][] turn = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int sqr = Math.min(n, m) / 2;

		for (int k = 0; k < sqr; k++) {
			int move = 2 * n + 2 * m - 8 * k - 4;
			int ni = k;
			int nj = k;
			int cycle = r % move;
			if(cycle == 0) {
				cycle = move;
			}
			for (int a = 0; a < move; a++) {
				int sti = ni;
				int stj = nj;
				int i = sti;
				int j = stj;
				for (int d = 0; d < cycle; d++) {
					if (i < n - 1 - k && j == k) {
						i = i + 1;
					} else if (i == n - 1 - k && j < m - 1 - k) {
						j = j + 1;
					} else if (i > k && j == m - 1 - k) {
						i = i - 1;
					} else if (i == k && j > k) {
						j = j - 1;
					}
					if (d == 0) {
						ni = i;
						nj = j;
					}
				}
				turn[i][j] = map[sti][stj];
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(turn[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}
}