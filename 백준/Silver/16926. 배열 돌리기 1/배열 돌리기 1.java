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
		int sqr = Math.min(n, m) / 2; // 돌아가는 네모들의 개수
		for (int d = 0; d < r; d++) {// 회전~
			for (int k = 0; k < sqr; k++) { // 네모들 갯수만큼 따로 실행
				// 네모의 반대편 꼭짓점: (k,k), (n-1-k), (m-1-k)
				int ni = k;
				int nj = k;
				for (int a = 0; a < 2 * n + 2 * m - 4 * k - 4; a++) {
					int si = ni;
					int sj = nj;
					if (ni < n - 1 - k && nj == k) {
						ni = ni + 1;
					} else if (ni == n - 1 - k && nj < m - 1 - k) {
						nj = nj + 1;
					} else if (ni > k && nj == m - 1 - k) {
						ni = ni - 1;
					} else if (ni == k && nj > k) {
						nj = nj - 1;
					}
					turn[ni][nj] = map[si][sj];
				}

			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = turn[i][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}