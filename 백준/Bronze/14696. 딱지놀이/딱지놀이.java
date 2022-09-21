import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 0; tc < t; tc++) {
			int da = sc.nextInt();
			int add[] = new int[da];
			for (int j = 0; j < da; j++) {
				add[j] = sc.nextInt();
			}
			int db = sc.nextInt();
			int bdd[] = new int[db];
			for (int j = 0; j < db; j++) {
				bdd[j] = sc.nextInt();
			}

			out: for (int i = 4; i >= 1; i--) {
				int acnt = 0;
				int bcnt = 0;

				for (int a = 0; a < add.length; a++) {
					if (add[a] == i) {
						acnt++;
					}
				}
				for (int b = 0; b < bdd.length; b++) {
					if (bdd[b] == i) {
						bcnt++;
					}
				}
				if (acnt < bcnt) {
					System.out.println("B");
					break out;
				} else if (acnt > bcnt) {
					System.out.println("A");
					break out;
				} else if (i == 1 && acnt == bcnt) {
					System.out.println("D");
				} else continue;
			}

		}
	}
}
