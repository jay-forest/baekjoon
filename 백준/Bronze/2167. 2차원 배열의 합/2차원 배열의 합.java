import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int sum = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			for (int i = a - 1; i < c; i++) {
				for (int j = b-1; j < d; j++) {
					sum += arr[i][j];
				}
			}
			System.out.println(sum);
		}
	}
}