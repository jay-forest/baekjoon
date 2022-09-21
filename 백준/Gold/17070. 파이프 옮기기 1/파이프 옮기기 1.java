import java.util.Scanner;

public class Main {
	public static int route = 0;
	static int house[][];
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		house = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				house[i][j] = sc.nextInt();
			}
		}

		move(1, 0, 1);

		System.out.println(route);

	}

	static void move(int dir, int i, int j) {

		if (i == n - 1 && j == n - 1) {
			route++;
			return;

		} else if (dir == 1) { // 가로
			if (j >= n - 1 || house[i][j + 1] == 1) {
				return;
			}
			move(1, i, j + 1);
			if (i + 1 < n && j + 1 < n && house[i + 1][j] + house[i][j + 1] + house[i + 1][j + 1] == 0) {
				move(2, i + 1, j + 1);
			}

		} else if (dir == 2) { // 대각선
			if (i >= n || j >= n) {
				return;
			}
			if (j+1<n && house[i][j + 1] == 0) {
				move(1, i, j + 1);
			}

			if (i + 1 < n && j + 1 < n && house[i + 1][j] + house[i][j + 1] + house[i + 1][j + 1] == 0) {
				move(2, i + 1, j + 1);
			}
			if (i+1<n && house[i+1][j] == 0) {
				move(3, i + 1, j);
			}

		} else if (dir == 3) { // 세로
			if (i >= n - 1 || house[i + 1][j] == 1) {
				return;
			}
			if (i + 1 < n && j + 1 < n && house[i + 1][j] + house[i][j + 1] + house[i + 1][j + 1] == 0) {
				move(2, i + 1, j + 1);
			}
			move(3, i + 1, j);
		}
		return;
	}

}