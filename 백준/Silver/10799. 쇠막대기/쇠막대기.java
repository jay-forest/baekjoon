import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bars = 0;
		Stack<Character> ironbar = new Stack<>();
		char[] cut = sc.next().toCharArray();
		for (int i = 0; i < cut.length; i++) {
			if (cut[i] == '(') {
				ironbar.push(cut[i]);
			} else if (cut[i] == ')' && cut[i - 1] == '(') {
				ironbar.pop();
				bars = bars + ironbar.size();
			} else {
				ironbar.pop();
				bars++;
			}
		}
		System.out.println(bars);
		sc.close();
	}
}