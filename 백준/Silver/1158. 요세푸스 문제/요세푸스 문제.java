import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		LinkedList<Integer> people = new LinkedList<>();
		int[] gone = new int[n];

		for (int i = 1; i <= n; i++) {
			people.add(i);
		}
		for(int i = 0; i<n-1; i++) {
			for (int j = 0; j < k - 1; j++) {
				int a= people.poll();
				people.add(a);
			}
			int b = people.poll();
			gone[i] = b;
		}
		gone[n-1] = people.poll();
		System.out.print("<");
		for (int i = 0; i<n-1; i++) {
			System.out.printf("%d, ", gone[i]);
		}
		System.out.printf("%d>", gone[n-1]);
	}
}