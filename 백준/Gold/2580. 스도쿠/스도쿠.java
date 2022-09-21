import java.util.Scanner;

public class Main {
	static int sdk[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sdk = new int[9][9];
//		blank = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sdk[i][j] = sc.nextInt();
				if (sdk[i][j] == 0) {
//					blank++;
				}
			}
		}
//		System.out.println(space.size());

		fillin(0, 0);
		sc.close();
		

	}

	private static void fillin(int row, int col) {
		if(col==9) {
			fillin(row+1, 0);
			return;
		}
		if(row==9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(sdk[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
			System.exit(0);
			return;
		}
		if(sdk[row][col]==0) {
			for(int i = 1; i<=9; i++) {
				if(numcheck(row, col, i)) {
					sdk[row][col] = i;
					fillin(row, col+1);
				}
			}
			sdk[row][col]=0;
            return;
		}
		fillin(row, col+1);
		
	}

	private static boolean numcheck(int row, int col, int num) {
		for(int i = 0; i<9; i++) {
			if(sdk[row][i]==num) {
				return false;
			}
		}
		for(int i = 0; i<9; i++) {
			if(sdk[i][col]==num) {
				return false;
			}
		}
		int sqrrow = (row/3)*3;
		int sqrcol = (col/3)*3;
		for (int i = sqrrow; i < (3 + sqrrow); i++) {
			for (int j = sqrcol; j < (3 + sqrcol); j++) {
				if(sdk[i][j]==num) {
					return false;
				}
			}
		}
		
		return true;
	}
}
