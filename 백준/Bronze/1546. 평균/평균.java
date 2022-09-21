import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score;
		int max = 0;
		int sum = 0;
		for (int i = 0; i<n; i++) {
			score = sc.nextInt();
			max = Math.max(score, max);
			sum = sum + score;
		}
		double avg = (double) (sum*100)/(n*max);
		System.out.println(avg);	
		sc.close();
	}
}