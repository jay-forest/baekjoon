import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> num = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int back = -1;
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			switch (str) {
			case "push":
				int a = sc.nextInt();
				num.add(a);
				back = a;
				break;
			case "pop":
				if (!num.isEmpty()) {
					sb.append(num.poll()+"\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(num.size()+"\n");
				break;
			case "empty":
				if (num.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
			case "front":
				if (!num.isEmpty()) {
					sb.append(num.peek()+"\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if (!num.isEmpty()) {
					sb.append(back+"\n");
				} else {
					sb.append("-1\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}