import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sch[] = new int[s + 1];
		for (int i = 1; i <= s; i++) {
			sch[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				for (int j = 1; b * j <= s; j++) {
					if (sch[b * j] == 1) {
						sch[b * j] = 0;
					} else if (sch[b * j] == 0)
						sch[b * j] = 1;
				}
			} else if (a == 2) {
				if (sch[b] == 1) {
					sch[b] = 0;
				} else if (sch[b] == 0)
					sch[b] = 1;
				out: for (int j = 1; b - j > 0 && b + j <= s; j++) {
					if (sch[b + j] == sch[b - j]) {
						if (sch[b + j] == 1) {
							sch[b + j] = 0;
						} else if (sch[b + j] == 0)
							sch[b + j] = 1;
						if (sch[b - j] == 1) {
							sch[b - j] = 0;
						} else if (sch[b - j] == 0)
							sch[b - j] = 1;
					} else
						break out;
				}
			}
		}
		for (int i = 1; i <= s; i++) {
			System.out.printf("%d ", sch[i]);
			if (i%20==0) {
				System.out.println();
			}
		}
		sc.close();
	}
}