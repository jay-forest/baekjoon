import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> cal = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String line = sc.next();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if ((int) c >= 65) {
				sb.append(c);
			} else {
				if (cal.isEmpty() || c == '(') {
					cal.push(c);
				} else if (c==')') {
					while(cal.peek()!='(') {
						sb.append(cal.pop());
					}
					cal.pop();		
				} else {
					// order가 크면 그냥 push 아니면 pop, 닫는 괄호면 여는 괄호까지 pop
					if (order(c) > order(cal.peek())) {
						cal.push(c);
					} else if (order(c) <= order(cal.peek())) {
						while (!cal.isEmpty() && order(c) <= order(cal.peek())) {
							sb.append(cal.pop());
						}
						cal.push(c);
					}

				}
			}
		}
		while(!cal.isEmpty()) {
			sb.append(cal.pop());
		}
		System.out.println(sb.toString());

	}

	public static int order(char c) {
		if (c == '+' || c == '-') {
			return 1;
		} else if (c == '*' || c == '/') {
			return 2;
		} else
			return 0;
	}

}