import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		for (int i=0; i<9; i++) {
			arr[i]= sc.nextInt();
		}
		int Max = 0;
		for (int i=0; i<9; i++) {
			Max = Math.max(arr[i], Max);
		}
		for (int i=0; i<9; i++) {
		if (arr[i]==Max) {
			System.out.println(Max);
			System.out.println(i+1);
		}
		}
	}
}