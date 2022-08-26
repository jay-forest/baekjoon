import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		boolean allclean = false;
		int turn = 0;
		int clean = 1;
		int[] di = { -1, 0, 1, 0 };
		int[] dj = { 0, 1, 0, -1 };
		int[][] room = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				room[i][j] = sc.nextInt();
			}
		}
		room[r][c] = 2;
		while (!allclean) {
			int ld = (d + 3) % 4;
			int lr = r + di[ld];
			int lc = c + dj[ld];
			if (lr > 0 && lc > 0 && lr < n - 1 && lc < m - 1 && room[lr][lc] == 0) {
				d = ld;
				r = lr;
				c = lc;
				room[r][c] = 2;
				++clean;
				turn = 0;
			} else if (room[lr][lc] == 1 || room[lr][lc] == 2) {
				d = ld;
				++turn;
				if (turn == 4) {
					r = r - di[d];
					c = c - dj[d];
					turn = 0;
					if (room[r][c] == 1) {
						allclean = true;
					}
				}
			}
		}
		sc.close();
		System.out.println(clean);
	}
}