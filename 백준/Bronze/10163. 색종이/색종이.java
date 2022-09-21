import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper[][] = new int[101][101];
		int n = sc.nextInt();
		int black[] = new int[n+1];

		for (int b = 1; b <= n; b++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int l = sc.nextInt();
			int h = sc.nextInt();

			for (int p = x; p < x + l; p++) {
				for (int q = y; q < y + h; q++) {
					paper[p][q] = b;
				}
			}
		}

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				black[paper[i][j]]++;
				}
		}
		for (int i=1; i<=n; i++) {
		System.out.println(black[i]);	
		}
	}
}
