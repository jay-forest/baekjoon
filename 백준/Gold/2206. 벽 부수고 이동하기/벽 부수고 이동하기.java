import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static int ans;
	static boolean[][][] visited;
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new boolean[n][m][2];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		ans = 0;
		findroute();
		if (visited[n - 1][m - 1][0] || visited[n - 1][m - 1][1]) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}

	static int di[] = { -1, 0, 1, 0 };
	static int dj[] = { 0, 1, 0, -1 };

	private static void findroute() {
		Queue<Point> que = new LinkedList<Point>();
		que.add(new Point(0, 0, 1, false));
		visited[0][0][0] = true;
		while (!que.isEmpty()) {
			Point curr = que.poll();
			int r = curr.row;
			int c = curr.col;
			int route = curr.route;
			boolean one = curr.one;
//			System.out.printf("%d, %d, %b, %d\n", r, c, one, route);

			if (r == n - 1 && c == m - 1) {
				ans = route;
				return;
			}

			for (int d = 0; d < 4; d++) {
				int nr = r + di[d];
				int nc = c + dj[d];

				if (nr < 0 || nc < 0 || nr >= n || nc >= m) {
					continue;
				}

				if (one && !visited[nr][nc][1]) {
					if (visited[nr][nc][1]) {
						continue;
					}
					if (map[nr][nc] == 1) {
						visited[nr][nc][1] = true;
						continue;
					} else {
						visited[nr][nc][1] = true;
//						System.out.printf("%d, %d, %b, %d\n", nr, nc, one, route + 1);
						que.add(new Point(nr, nc, route + 1, one));
					}

				} else if (!one) {
					if (visited[nr][nc][0]) {
						continue;
					}
					if (map[nr][nc] == 1) {
						visited[nr][nc][0] = true;
						visited[nr][nc][1] = true;
//						System.out.printf("%d, %d, %b, %d\n", nr, nc, one, route + 1);
						que.add(new Point(nr, nc, route + 1, true));
					} else {
						visited[nr][nc][0] = true;
//						System.out.printf("%d, %d, %b, %d\n", nr, nc, one, route + 1);
						que.add(new Point(nr, nc, route + 1, one));
					}
				}
			}

		}

	}

	static class Point {
		int row;
		int col;
		int route;
		boolean one;

		public Point(int row, int col, int route, boolean one) {
			super();
			this.row = row;
			this.col = col;
			this.route = route;
			this.one = one;

		}
	}

}
