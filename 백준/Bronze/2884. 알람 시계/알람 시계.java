import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cm = m-45;
		int ch = h;
		if(cm<0) {
			cm = 60+cm;
			ch= ch-1;
		}
		if (ch<0) {
			ch = ch+24;
		}
		System.out.printf("%d %d", ch, cm);
	}
}