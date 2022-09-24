import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			String str = sc.next();
			switch(str) {
			case "push":
				int a = sc.nextInt();
				stack.push(a);
				break;
			case "pop":
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				if(!stack.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(1).append("\n");
				}
				break;
			case "top":
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}