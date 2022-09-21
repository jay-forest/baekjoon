import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		int a = h + (t / 60);
		int b = m + (t % 60);

		if (b >= 60) {
			b = b % 60;
			a = a + 1;
		}
		if (a >= 24) {
			a = a % 24;
		}
		System.out.printf("%d %d", a, b);

		sc.close();

	}
}
