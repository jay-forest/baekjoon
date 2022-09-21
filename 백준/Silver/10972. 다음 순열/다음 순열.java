//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				int a = i;
				int b = i - 1;
				int c = 0;
				for (int j = arr.length - 1; j >= 0; j--) {
					if (arr[j] > arr[b]) {
						c = j;
						break;
					}
				}
				int temp = arr[c];
				arr[c] = arr[b];
				arr[b] = temp;
				// sort 나 뒤집기나 둘중 아무거나 해주면 됨
//				Arrays.sort(arr, a, arr.length);
				for (int j = 0; j < (arr.length - a) / 2; j++) {
					int rev = arr[a + j];
					arr[a + j] = arr[arr.length - 1 - j];
					arr[arr.length - 1 - j] = rev;
				}
				for (int h = 0; h < arr.length; h++) {
					sb.append(arr[h] + " ");
				}
				break;
			}
			
		}
		if (sb.length()!=0) {
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}

	}

}