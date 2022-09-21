import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		String str = sc.next();
		Deque<Character> check = new LinkedList<>();
		Stack<Character> boom = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			check.add(line.charAt(i));
			if (check.size() >= str.length()) {
				int strend = str.length() - 1;
				while (true) {
					if (check.peekLast() == str.charAt(strend)) {
						boom.push(check.pollLast());
						strend--;
					} else {
						while (boom.size() != 0) {
							check.add(boom.pop());	
						}
						break;
					}
					if (strend == -1) {
						boom.clear();
						break;
					}
				}
			}
		}
		while (check.size() != 0) {
			sb.append(check.poll());
		}
		String result = (sb.length() == 0) ? "FRULA" : sb.toString();
		System.out.println(result);
		sc.close();

	}
}