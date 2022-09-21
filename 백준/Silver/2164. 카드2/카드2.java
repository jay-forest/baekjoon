import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> cards = new LinkedList<Integer>();
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			cards.add(i);
		}
		while(cards.size()!=1) {
			cards.remove();
			cards.add(cards.poll());
		}
		int a = cards.poll();
		System.out.println(a);
	}
}