import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] alpha = new int [26];
		Arrays.fill(alpha, -1);
		for(int i = 0; i<str.length(); i++) {
			int a = str.charAt(i)-'a';
			if(alpha[a]==-1) {
				alpha[a] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<26; i++) {
			sb.append(alpha[i]).append(" ");
		}
		System.out.println(sb.toString());
	}

}
