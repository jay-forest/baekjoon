import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			int b = sc.nextInt();
			if(a>b) {
				sb.append(b).append(" ");
			}
		}
		System.out.println(sb.toString());

	}

}
