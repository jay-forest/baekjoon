import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double per[] = new double[c];
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int score[] = new int[n];
			int sum = 0;
			for (int k = 0; k < n; k++) {
				score[k] = sc.nextInt();
				sum = sum + score[k];
			}
			double avg = (double) sum / n;
			int cnt = 0;
			for (int k = 0; k < n; k++) {
				if (score[k] > avg)
					cnt++;
			}
			per[i] = ((cnt * 100000.0) / n) / 1000.0;
		}
		for (int i = 0; i < c; i++) {
			System.out.println(String.format("%.3f", per[i])+"%");
		}
		sc.close();
	}
}