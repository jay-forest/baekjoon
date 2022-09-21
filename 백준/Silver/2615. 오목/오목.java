import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] table = new int[19][19];
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		int[] di = { -1, 0, 1, 1 };
		int[] dj = { 1, 1, 1, 0 };
		int[] opi = { 1, 0, -1, -1 };
		int[] opj = { -1, -1, -1, 0 };
		boolean five = false;
		int win = 0;
		int wini = 0;
		int winj = 0;
		here: for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				for (int d = 0; d < 4; d++) {
					out: for (int k = 1; k <= 4; k++) {
						int ni = i + di[d] * k;
						int nj = j + dj[d] * k;
						if (ni < 19 && nj < 19 && ni >= 0 && nj >= 0) {
							if (table[i][j] != 0 && table[ni][nj] == table[i][j]) {
								if (k == 4) {
									int a = i + di[d] * 5;
									int b = j + dj[d] * 5;
									int m = i + opi[d];
									int n = j + opj[d];
									if (a >= 19 || b >= 19 || a < 0 || b < 0 || table[i][j] != table[a][b]) {
										if (m >= 19 || n >= 19 || m < 0 || n < 0 || table[i][j] != table[m][n]) {
											five = true;
											win = table[i][j];
											wini = i + 1;
											winj = j + 1;
											break here;
										}
									}
								}
							} else
								break out;
						}
					}
				}
			}
		}
		System.out.println(win);
		if (five) {
			System.out.printf("%d %d", wini, winj);
		}
	}
}