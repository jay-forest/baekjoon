import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			boolean valid = false;
			String line = sc.next();
			Stack<Character> check = new Stack<>();
			out: for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == '(') {
					check.push(c);
				} else if (!check.isEmpty()) {
					if (c == ')' && check.peek() == '(') {
						check.pop();
					} else {
						valid = false;
						break out;
					}
				} else {
					valid = false;
					break out;
				}
				if(i==line.length()-1) {
					valid = check.isEmpty();
				}
			}
			if (valid) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
	}
}