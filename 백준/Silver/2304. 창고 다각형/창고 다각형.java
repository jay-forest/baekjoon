import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] pil = new int[n][2];
		int h = -1;
		int right = -1;
		int left = 1001;
		int stand = -1;
		for (int i = 0; i < n; i++) {
			pil[i][0] = sc.nextInt();
			pil[i][1] = sc.nextInt();
			h = Math.max(h, pil[i][1]);
			if (h == pil[i][1]) {
				stand = pil[i][0];
			}
			right = Math.max(right, pil[i][0]);
			left = Math.min(left, pil[i][0]);
		}
		int w = right - left + 1;
		int[][] map = new int[h][w];
		for (int i = 0; i < w; i++) {
			out : for (int k = 0; k < n; k++) {
				if (pil[k][0] == i + left) {
					for (int j = 0; j < pil[k][1]; j++) {
						map[j][i] = 1;
					}
					break out;
				}
			}
		}
		stand = stand - left;
		for (int j = 1; j < stand; j++) {
			for (int i = 0; i < h; i++) {
				if (map[i][j - 1] == 1) {
					map[i][j] = 1;
				}
			}
		}
		for (int j = w - 2; j > stand; j--) {
			for (int i = 0; i < h; i++) {
				if (map[i][j + 1] == 1) {
					map[i][j] = 1;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == 1)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}