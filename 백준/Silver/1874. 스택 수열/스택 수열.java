
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> num = new Stack<>();
		int line[] = new int[n];
		for (int i = 0; i < n; i++) {
			line[i] = sc.nextInt();
		}
		boolean able = true;
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		int i = 0;
		while(i<n) {
			if (cnt <line[i]) {
				num.push(cnt);
				sb.append("+\n");
				cnt++;
			} else if (cnt==line[i]) {
				num.push(cnt);
				sb.append("+\n");
				cnt++;
				num.pop();
				sb.append("-\n");
				i++;
			} else if (cnt>line[i]) {
				if(num.isEmpty() || num.peek()!=line[i]) {
					able = false;
					break;
				} else {
					num.pop();
					sb.append("-\n");
					i++;
				}
			} 

		}
		if(able) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}