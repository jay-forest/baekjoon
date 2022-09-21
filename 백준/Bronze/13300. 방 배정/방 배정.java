import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] stu = new int[2][6];

		for (int d = 0; d < n; d++) {
			int r = sc.nextInt(); // 여학생이 0, 남학생이 1
			int c = sc.nextInt() - 1; // 학년-1 = index
				stu[r][c] = stu[r][c] + 1;
		}

		int room = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				if (stu[i][j]==0) {
					continue;
				} else if (stu[i][j] != 0) {
					if ((stu[i][j] % k) == 0) {
					room = room + (stu[i][j] / k);
					} else {
						room = room + (stu[i][j] / k)+1;
					}
				}	
			}
		}
		System.out.println(room);
	}
}
