import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deq = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			String str = sc.next();
			switch(str) {
			case "push_front":
				int a = sc.nextInt();
				deq.addFirst(a);
				break;
			case "push_back":
				a = sc.nextInt();
				deq.addLast(a);
				break;
			case "pop_front":
				if(!deq.isEmpty()) {
					sb.append(deq.poll()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "pop_back":
				if(!deq.isEmpty()) {
					sb.append(deq.pollLast()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "size":
				sb.append(deq.size()).append("\n");
				break;
			case "empty":
				if(!deq.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(1).append("\n");
				}
				break;
			case "front":
				if(!deq.isEmpty()) {
					sb.append(deq.peekFirst()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "back":
				if(!deq.isEmpty()) {
					sb.append(deq.peekLast()).append("\n");
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