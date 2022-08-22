import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> line = new LinkedList<>();
		Stack<Integer> side = new Stack<>();
		ArrayList<Integer> snackline = new ArrayList<>();
		int order = 1;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			line.add(sc.nextInt());
		}
		boolean snack = true;
		while (!line.isEmpty()) {
			while (!line.isEmpty()&&line.peek() != order) {
				side.push(line.poll());
			}
			if (!line.isEmpty()&& line.peek() == order) {
				snackline.add(line.poll());
				++order;
			}
			while (!side.isEmpty() && side.peek() == order) {
				snackline.add(side.pop());
				++order;
			}
			if (line.isEmpty() && !side.isEmpty() && side.peek() != order) {
				snack = false;
				break;
			}
		}
		if (snack) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}
}