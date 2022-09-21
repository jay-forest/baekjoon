import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] full = {1, 1, 2, 2, 2, 8};
		int [] pce = new int [6];
		for (int i=0; i<6; i++) {
			pce[i] = sc.nextInt();
		}
		for (int i=0; i<6; i++) {
		System.out.printf("%d ", full[i]-pce[i]);
		}
	}
}