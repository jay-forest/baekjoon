import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			Queue<Integer> printer = new LinkedList<>();
			int n = sc.nextInt();
			int [] order = new int [n];
			int m = sc.nextInt();
			for(int i = 0; i<n; i++) {
				int a = sc.nextInt();
				order[i] = a;
				printer.add(a);
			}
			int ans = 0;
			Arrays.sort(order);
			for(int i = n-1; i>=0; i--) {
				while(order[i]!=printer.peek()) {
					printer.add(printer.poll());
					if(m==0) {
						m=printer.size();
					}
					m--;
				}
				printer.poll();
				if(m==0) {
					ans = n-i;
					break;
				}
				m--;
			}
			System.out.println(ans);
		}
	}
}
