import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int prize = 0;
		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		if (num[0]==num[2]) {
			prize = 10000+num[0]*1000;
		} else if (num[0]==num[1] || num[1]==num[2]) {
			prize = 1000+num[1]*100;
		} else if (num[0]!=num[1] && num[1]!=num[2]) {
			prize = num[2]*100; 
		}
		System.out.println(prize);
	}
}