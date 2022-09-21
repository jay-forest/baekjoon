import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int r = sc.nextInt();
		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			int a = sc.nextInt();
			arr = shift(arr, a);
			if (a == 3 || a == 4) {
				int b = m;
				m = n;
				n = b;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
	private static int[][] shift(int[][] arr, int d) {
		int temp[][] = null;
		switch (d) {
		case 1:
			temp = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					temp[i][j] = arr[n - 1 - i][j];
				}
			}
			break;
		case 2:
			temp = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					temp[i][j] = arr[i][m - 1 - j];
				}
			}
			break;
		case 3:
			temp = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					temp[i][j] = arr[n - 1 - j][i];
				}
			}
			break;
		case 4:
			temp = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					temp[i][j] = arr[j][m - 1 - i];
				}
			}
			break;
		case 5:
			temp = new int[n][m];
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < m / 2; j++) {
					temp[i][j] = arr[n / 2 + i][j];
					temp[i][m / 2 + j] = arr[i][j];
					temp[n / 2 + i][j] = arr[n / 2 + i][m / 2 + j];
					temp[n / 2 + i][m / 2 + j] = arr[i][m / 2 + j];
				}
			}
			break;
		case 6:
			temp = new int[n][m];
			for (int i = 0; i < n/2; i++) {
				for (int j = 0; j < m/2; j++) {
					temp[i][j] = arr[i][m / 2 + j];
					temp[i][m / 2 + j] = arr[n / 2 + i][m / 2 + j];
					temp[n / 2 + i][j] = arr[i][j];
					temp[n / 2 + i][m / 2 + j] = arr[n / 2 + i][j];
				}
			}
			break;
		}
		return temp;
	}
}