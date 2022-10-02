import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[][] map;
	static int maxdist;
	static int[][] dismap;
	static Queue<int[]> baby;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		maxdist = -1;
		baby = new LinkedList<>();
		dismap = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					baby.add(new int[] { i, j });
				}
			}
		}
		int ans = findDist();
		System.out.println(ans);

	}

	static int di[] = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int dj[] = { -1, 0, 1, 1, 1, 0, -1, -1 };

	private static int findDist() {

		while (!baby.isEmpty()) {
			int[] now = baby.poll();
			int i = now[0];
			int j = now[1];
			for (int d = 0; d < 8; d++) {
				int ni = i + di[d];
				int nj = j + dj[d];
				if (ni < 0 || nj < 0 || ni >= n || nj >= m) {
					continue;
				} else if (dismap[ni][nj] != 0 || map[ni][nj] == 1) {
					continue;
				}
				dismap[ni][nj] = dismap[i][j] + 1;
				maxdist = Math.max(maxdist, dismap[ni][nj]);
				baby.add(new int[] { ni, nj });
			}
		}
		return maxdist;

	}

}
