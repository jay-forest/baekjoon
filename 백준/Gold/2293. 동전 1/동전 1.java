import java.util.Scanner;

public class Main {
	static int dp[];
	static int k;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int coin[] = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		dp = new int[k + 1];
		make(coin);
		sc.close();
		System.out.println(dp[k]);

	}

	private static void make(int[] coin) {
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				dp[j] = dp[j] + dp[j - coin[i]];
			}
		}

	}
}
