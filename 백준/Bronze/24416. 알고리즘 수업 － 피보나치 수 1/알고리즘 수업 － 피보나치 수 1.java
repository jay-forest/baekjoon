import java.util.Scanner;

public class Main {
	
	static int cnt = 0;
	static int rcnt = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fib(n);
		int arr [] = new int [n+1];
		for(int i = 3; i<=n; i++) {
			cnt++;
			arr[1] = 1;
			arr[2] = 1;
			arr[i] = arr[n-1] + arr[n-2];
		}
		System.out.printf("%d %d", rcnt, cnt);
	}
	
	public static int fib(int n) {
		rcnt++;
		if(n==1 || n==2) {
			rcnt--;
			return 1;
		} else {
			return (fib(n-1) + fib(n-2));
		}
	}
}