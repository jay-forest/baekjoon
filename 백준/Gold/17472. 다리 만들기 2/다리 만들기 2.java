import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int map[][];
	static int bridgeMap[][];
	static int di[] = { -1, 0, 1, 0 }; // 상 우 하 좌
	static int dj[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (a == 1) {
					a = -1;
				}
				map[i][j] = a;
			}
		}
		int isnum = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == -1) {
					findIsland(i, j, isnum);
					isnum++;
				}
			}
		}

		bridgeMap = new int[isnum][isnum];

//		for (int[] string : map) {
//			System.out.println(Arrays.toString(string));
//		}

		// 간선 길이를 구하기 위한 탐색
		// 가로세로탐색
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] != 0) {
					int start = map[i][j];
					for (int r = i + 1; r < n; r++) {
						if (map[r][j] != start && map[r][j] != 0) {
							int end = map[r][j];
							if (r - i - 1 > 1 && bridgeMap[start][end] == 0) {
								bridgeMap[start][end] = r - i - 1;
								bridgeMap[end][start] = r - i - 1;
							} else if (r - i - 1 > 1 && bridgeMap[start][end] != 0) {
								bridgeMap[start][end] = Math.min(bridgeMap[start][end], r - i - 1);
								bridgeMap[end][start] = bridgeMap[start][end];
							}
							break;
						}
						if (map[r][j] == start) {
							break;
						}
					}
					for (int c = j + 1; c < m; c++) {
						if (map[i][c] != start && map[i][c] != 0) {
							int end = map[i][c];
							if (c - j - 1 > 1 && bridgeMap[start][end] == 0) {
								bridgeMap[start][end] = c - j - 1;
								bridgeMap[end][start] = c - j - 1;
							} else if (c - j - 1 > 1 && bridgeMap[start][end] != 0) {
								bridgeMap[start][end] = Math.min(bridgeMap[start][end], c - j - 1);
								bridgeMap[end][start] = bridgeMap[start][end];
							}
							break;
						}
						if (map[i][c] == start) {
							break;
						}
					}

				}
			}
		}

//		for (int[] string : bridgeMap) {
//			System.out.println(Arrays.toString(string));
//		}

		int isl[] = new int[isnum];
		boolean visited[] = new boolean[isnum];
		Arrays.fill(isl, Integer.MAX_VALUE);
		isl[1] = 0;
		for (int i = 1; i < isnum; i++) {
			int a = Integer.MAX_VALUE;
			int idx = -1;

			for (int j = 1; j < isnum; j++) {
				if (!visited[j] && isl[j] < a) {
					a = isl[j];
					idx = j;
				}
			}
			if(idx==-1) {
				break;
			}
			visited[idx] = true;
			for (int j = 1; j < isnum; j++) {
				if (!visited[j] && bridgeMap[idx][j] != 0 && bridgeMap[idx][j] < isl[j]) {
					isl[j] = bridgeMap[idx][j];
				}
			}

		}
//		System.out.println(Arrays.toString(isl));
		boolean nobridge = false;
		for (int j = 1; j < isnum; j++) {
			if(!visited[j]) {
				nobridge = true;
				break;
			}
		}
		if(!nobridge) {
			int sum = 0;
			for (int j = 1; j < isnum; j++) {
				sum+=isl[j];
			}
			System.out.println(sum);
		} else {
			System.out.println(-1);
		}
		
		br.close();
	}

	private static void findIsland(int i, int j, int isnum) {
		if (i >= n || j >= m || i < 0 || j < 0) {
			return;
		} else if (map[i][j] != -1) {
			return;
		}

		map[i][j] = isnum;
		for (int d = 0; d < 4; d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			findIsland(ni, nj, isnum);
		}

	}
}