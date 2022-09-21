import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int n = start;
		int cnt = 0;
		while(true) {
			int a = n/10;
			int b = n%10;
			++cnt;
			n = b*10 + (a+b)%10;
			if(n==start) {
				break;
			}
		}
		System.out.println(cnt);
	}
}