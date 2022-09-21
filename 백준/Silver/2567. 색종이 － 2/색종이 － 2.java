import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper[][] = new int[102][102];
		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					paper[i + 1][j + 1] = 1;
				}
			}
		}
		int di[] = { -1, 1, 0, 0 };
		int dj[] = { 0, 0, -1, 1 };
		int fence = 0;
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if (paper[i][j] == 1) {
					for (int d = 0; d < 4; d++) {
						int x = i + di[d];
						int y = j + dj[d];
						if (paper[x][y] == 0) {
							fence++;
						}
					}
				}
			}
		}
		System.out.println(fence);
	}
}