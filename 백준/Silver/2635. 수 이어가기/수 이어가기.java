import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> temp = new ArrayList<>();
		int max = 0;
		
		for (int i = n; i >= n / 2; i--) {
			ArrayList<Integer> dif = new ArrayList<>();
			dif.add(n);
			dif.add(i);
			int cnt = 2;
			out: for (int j = 2; dif.get(j - 1) >= 0; j++) {
				int num = dif.get(j - 2) - dif.get(j - 1);
				if (num >= 0) {
					dif.add(num);
					cnt++;
				} else break out;
			}
			if (cnt > max) {
				max = cnt;
				temp = dif;
			}
		}
		System.out.println(max);
		for (int i : temp)
			System.out.print( i + " ");
		sc.close();
	}
}
