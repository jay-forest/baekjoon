import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int t = 0; t<5; t++) {
			int a = sc.nextInt();
			if (a<40) {
				a = 40;
			}
			sum = sum+a;
		}
		System.out.println(sum/5);
    }
}