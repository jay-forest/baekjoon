import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> reverse = new Stack<>();
		int t = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= t; tc++) {
			StringBuilder sb = new StringBuilder();
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i)==' ') {
					while (!reverse.isEmpty()) {
						sb.append(reverse.pop());
					}
					sb.append(' ');
				} else reverse.push(line.charAt(i));		
			}
			while (!reverse.isEmpty()) {
				sb.append(reverse.pop());
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}
}