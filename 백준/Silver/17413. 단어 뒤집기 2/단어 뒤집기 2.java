import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.nextLine();
		Stack<Character> notag = new Stack<>();
		boolean intag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				while (!notag.isEmpty()) {
					sb.append(notag.pop());
				}
				sb.append(str.charAt(i));
				intag = true;
			} else if (str.charAt(i) == '>') {
				sb.append(str.charAt(i));
				intag = false;
			} else if (intag) {
				sb.append(str.charAt(i));
			}
			if (!intag && str.charAt(i) != ' '&& str.charAt(i) != '>') {
				notag.push(str.charAt(i));
			} else if (!intag && str.charAt(i) == ' ') {
				while (!notag.isEmpty()) {
					sb.append(notag.pop());
				}
				sb.append(str.charAt(i));
			}
		}
		while (!notag.isEmpty()) {
			sb.append(notag.pop());
		}
		System.out.println(sb.toString());
	}
}