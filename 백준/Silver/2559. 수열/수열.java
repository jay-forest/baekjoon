import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int tem[] = new int[n];
		for (int i = 0; i < n; i++) {
			tem[i] = sc.nextInt();
		}
		
		int max = -100 * k;
		for (int i = 0; i < n - k + 1; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum = sum + tem[i + j];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
		sc.close();
	}
}