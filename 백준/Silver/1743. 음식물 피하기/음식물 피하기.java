import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int map[][];
	static int maxcnt;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		map = new int[n + 1][m + 1];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (map[i][j] == 1) {
					cnt = 0;
					garbcnt(i, j);
					maxcnt = Math.max(maxcnt, cnt);
				}
			}
		}
		System.out.println(maxcnt);

	}

	static int di[] = { -1, 0, 1, 0 };
	static int dj[] = { 0, 1, 0, -1 };

	private static void garbcnt(int i, int j) {
		if (i < 1 || j < 1 || i > n || j > m) {
			return;
		} else if (map[i][j] != 1) {
			return;
		}
		cnt++;
		map[i][j] = 0;
		for (int d = 0; d < 4; d++) {
			garbcnt(i + di[d], j + dj[d]);
		}

	}

}
