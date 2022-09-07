import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String sta = Integer.toString(a);
		String stb = Integer.toString(b);
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			sb1.append(sta.charAt(2 - i));
			sb2.append(stb.charAt(2 - i));
		}
		int reva = Integer.parseInt(sb1.toString());
		int revb = Integer.parseInt(sb2.toString());

		int result = (reva > revb) ? reva : revb;
		System.out.println(result);
		sc.close();
	}
}