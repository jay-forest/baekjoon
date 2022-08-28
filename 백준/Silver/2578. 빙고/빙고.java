import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mine = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mine[i][j] = sc.nextInt();
			}
		}
		
		int threebingo = 0;
		out: for (int k = 1; k <= 25; k++) {
			int a = sc.nextInt();
			here: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (mine[i][j] == a) {
						mine[i][j] = 0;
						break here;
					}
				}
			}
			if (k > 10) {
				int bingo = 0;
				// 가로 세로
				for (int i = 0; i < 5; i++) {
					int sumrow = 0;
					int sumcol = 0;
					for (int j = 0; j < 5; j++) {
						sumrow += mine[i][j];
						sumcol += mine[j][i];
					}
					if (sumrow == 0) {
						bingo += 1;
					}
					if (sumcol == 0) {
						bingo += 1;
					}
				}
				// 대각선
				int sumld = 0;
				int sumrd = 0;
				for (int i = 0; i < 5; i++) {
					sumld += mine[i][i];
					sumrd += mine[i][4 - i];
				}
				if (sumld == 0) {
					bingo += 1;
				}
				if (sumrd == 0) {
					bingo += 1;
				}
				if (bingo >= 3) {
					threebingo = k;
					break out;
				}
			}
		}
		System.out.println(threebingo);
		sc.close();
	}
}