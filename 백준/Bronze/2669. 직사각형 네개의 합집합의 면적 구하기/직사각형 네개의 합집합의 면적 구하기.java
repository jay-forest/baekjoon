import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] paper = new int[100][100];
		int cnt = 0;
		for (int d = 0; d < 4; d++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a = sc.nextInt();

			for (int i = x; i < z; i++) {
				for (int j = y; j < a; j++) {
					paper[i][j] = 1;
				}
			}
		}
		
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if(paper[i][j]==1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
