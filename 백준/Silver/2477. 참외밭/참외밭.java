import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] fence = new int[6];
		int hmax = 0;
		int wmax = 0;
		int hi = 0;
		int wi = 0;
		for (int i = 0; i < 6; i++) {
			int a = sc.nextInt();
			fence[i] = sc.nextInt();
			if (a == 1 || a == 2) {
				if (hmax < fence[i]) {
					hmax = fence[i];
					hi = i;
				}
			} else if (a == 3 || a == 4) {
				if (wmax < fence[i]) {
					wmax = fence[i];
					wi = i;
				}
			}
		}
		int smh = fence[(wi + 3) % 6];
		int smw = fence[(hi + 3) % 6];

		int result = k * ((hmax * wmax) - (smh * smw));
		System.out.println(result);
	}
}