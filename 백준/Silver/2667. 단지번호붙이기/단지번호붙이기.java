import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int n;
	static int map[][];
	static int cnt;
	static boolean visited[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		visited = new boolean[n][n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		ArrayList<Integer> apartnum = new ArrayList<>();
		int num = 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1) {
					cnt = 0;
					findComplex(i, j, num);
					num++;
					apartnum.add(cnt);
				}
			}
		}
		Collections.sort(apartnum);
		System.out.println(num - 2);
		for (int i = 0; i < apartnum.size(); i++) {
			System.out.println(apartnum.get(i));
		}

		sc.close();
	}

	static int di[] = { -1, 0, 1, 0 };
	static int dj[] = { 0, 1, 0, -1 };

	private static void findComplex(int i, int j, int num) {
		if (i < 0 || j < 0 || i >= n || j >= n) {
			return;
		} else if (map[i][j] == 0 || visited[i][j]) {
			return;
		}
		map[i][j] = num;
		visited[i][j] = true;
		cnt++;

		for (int d = 0; d < 4; d++) {
			findComplex(i + di[d], j + dj[d], num);
		}

	}
}