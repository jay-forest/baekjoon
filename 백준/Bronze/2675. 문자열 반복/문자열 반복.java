import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 0; tc<t; tc++) {
			int n = sc.nextInt();
			String str = sc.next();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i<str.length(); i++) {
				for (int j = 0; j<n; j++) {
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
	}
}