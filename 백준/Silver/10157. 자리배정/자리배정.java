import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		if (k > c * r) {
			System.out.println(0);
		} else {
			int[][] line = new int[r][c];
			int sti = r - 1;
			int stj = 0;
			int[] di = { -1, 0, 1, 0 };
			int[] dj = { 0, 1, 0, -1 };
			int a = 0;
			out: for (int i = 1; i <= r * c; i++) {
				if (i == 1) {
					line[sti][stj] = 1;
				} else {
					int p = sti + di[a % 4];
					int q = stj + dj[a % 4];
					if (p < 0 || q < 0 || p >= r || q >= c || line[p][q] != 0) {
						++a;
					}
					sti = sti + di[a % 4];
					stj = stj + dj[a % 4];
					line[sti][stj] = i;
				}
				if (i == k) {
					break out;
				}
			}
			System.out.printf("%d %d", stj + 1, r - sti);
		}
		sc.close();
	}
}