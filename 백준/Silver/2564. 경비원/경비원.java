import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wid = sc.nextInt();
		int hgt = sc.nextInt();
		int n = sc.nextInt();
		int fence = (wid + hgt) * 2;
		int[][] store = new int[n+1][2];
		for (int i = 0; i < n + 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			store[i][0] = a;
			store[i][1] = b;
		}
		int sum = 0;
		int distance = 0;
		if (store[n][0] == 1) {
			distance = fence - store[n][1];
		} else if (store[n][0] == 2) {
			distance = hgt + store[n][1];
		} else if (store[n][0] == 3) {
			distance = store[n][1];
		} else if (store[n][0] == 4) {
			distance = hgt*2 + wid - store[n][1];
		}
		for (int i = 0; i < n; i++) {
			int length = 0;
			if (store[i][0] == 1) {
				length = fence - store[i][1];
			} else if (store[i][0] == 2) {
				length = hgt + store[i][1];
			} else if (store[i][0] == 3) {
				length = store[i][1];
			} else if (store[i][0] == 4) {
				length = hgt*2 + wid - store[i][1];
			}
			int d = Math.abs(distance-length);
			sum = sum + Math.min(d, fence-d);
		}
		System.out.println(sum);
		sc.close();
	}
}