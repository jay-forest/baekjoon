import java.util.Scanner;

public class Main {
	static long cnt;
	static long max = 0;
	static int num[];
	static int k;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			max = Math.max(max, num[i]);
		}

		cut(0, max+1);
		System.out.println(cnt);
	}

	private static void cut(long left, long right) {
		if (left > right) {
			return;
		}
		long mid = (left + right) / 2;
		if(mid==0) {
			mid = 1;
		}	
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += num[i] / mid;
		}
		if (sum < k) {
			cut(left, mid-1);
		} else {
			cnt = mid;
			cut(mid + 1, right);
		}
		return;
	}
}