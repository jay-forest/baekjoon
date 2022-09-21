import java.util.Scanner;

public class Main {
	static int n;
	static int[][] board;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		cnt = 0;
		board = new int[n][n];

		putQueen(0);

		System.out.println(cnt);
		sc.close();

	}

	private static void putQueen(int row) {
		if (row == n) {
			cnt++;
			return;
		}

		for (int j = 0; j < n; j++) {
			if (canPut(row, j)) {
				board[row][j] = 1;
				putQueen(row + 1);
				board[row][j] = 0;
			}
		}
		return;
	}

	private static boolean canPut(int i, int j) {
		int lcross = j;
		int rcross = j;
		for (int r = i - 1; r >= 0; r--) {
			lcross--;
			rcross++;
			if (board[r][j] == 1) {
				return false;
			}
			if (lcross >= 0 && board[r][lcross] == 1) {
				return false;
			}
			if (rcross < n && board[r][rcross] == 1) {
				return false;
			}
		}

		return true;
	}

}
