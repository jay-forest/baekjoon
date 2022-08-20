import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int score = 0;
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					++cnt;
					score = score + cnt;
				} else
					cnt = 0;
			}
			System.out.println(score);
		}
	}
}