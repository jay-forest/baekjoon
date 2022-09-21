import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int t = sc.nextInt();
		int x = 0;
		int y = 0;
		int a = (t+p)%(2*w);
		if (a>w) {
			x = 2*w-a;
		} else
			x = a;
		int b = (t+q)%(2*h);
		if (b>h) {
			y = 2*h-b;
		} else
			y = b;
		System.out.printf("%d %d", x, y);
	}
}