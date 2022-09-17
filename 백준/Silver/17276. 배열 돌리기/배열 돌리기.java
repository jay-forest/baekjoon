import java.util.Scanner;

public class Main {
	static int n;
	static int arr[][];
	static int temp[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			n = sc.nextInt();
			arr = new int[n][n];
			int angle = sc.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			turn(angle);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(temp[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
		}
	}

	static void turn(int angle) {

		if (angle < 0) {
			angle = 360 + angle;
		}
		int shift = (angle / 45);

		if (shift % 8 == 0) {
			temp = arr;
			return;
		} else {
			temp = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					temp[i][j] = arr[i][j];
				}
			}
			for (int k = 0; k < (n - 1) / 2; k++) {
				int move = (n - 1 - (2 * k)) / 2;

				int np = k;
				int nq = k;

				for (int h = 0; h < 8; h++) {
					int stp = np;
					int stq = nq;
					int p = stp;
					int q = stq;
					for (int i = 0; i < shift; i++) {
						if (p == k && q < (n - 1 - k)) {
							q = q + move;
						} else if (q == (n - 1 - k) && p < n - 1 - k) {
							p = p + move;
						} else if (p == n - 1 - k && q > k) {
							q = q - move;
						} else if (q == k && p > k) {
							p = p - move;

						}
						if (i == 0) {
							np = p;
							nq = q;
						}

					}
					temp[p][q] = arr[stp][stq];
				}
			}
			return;
		}
	}

}