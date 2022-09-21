import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[][] paper = new int[100][100];
		int area = 0;

		for (int d = 0; d < t; d++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					paper[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (paper[i][j] == 1) {
					area++;
				}
			}
		}
		System.out.println(area);
		sc.close();
	}
}
