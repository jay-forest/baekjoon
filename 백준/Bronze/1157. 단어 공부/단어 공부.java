import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 91) {
				int a = (int) str.charAt(i) - 65;
				count[a]++;
			} else {
				int a = (int) str.charAt(i) - 97;
				count[a]++;
			}
		}
		char c = '?';
		int max = 0;
		for(int i = 0; i<26; i++) {
			if(count[i]>max) {
				max = count[i];
				c = (char) (i+65);
			} else if (count[i]==max) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}