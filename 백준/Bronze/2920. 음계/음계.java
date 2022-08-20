import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scale[] = new int[8];
		for (int i = 0; i < 8; i++) {
			scale[i] = sc.nextInt();
		}
		boolean as = false;
		boolean change = false;
		out: for (int i = 0; i < 7; i++) {
			if (!change && scale[i] < scale[i + 1]) {
				as = true;
			} else if (!change && as && scale[i] > scale[i + 1]) {
				change = true;
				break out;
			}
		}
		if (!change) {
			if (as) {
				System.out.println("ascending");
			} else
				System.out.println("descending");
		} else
			System.out.println("mixed");
		sc.close();
	}
}