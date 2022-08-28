import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			boolean hasnum = false;
			if((i/100)%3==0 && (i/100)!=0) {
				hasnum = true;
				System.out.print("-");
			}
			if(((i/10)%10)%3==0 && ((i/10)%10)!=0) {
				hasnum = true;
				System.out.print("-");
			}
			if((i%10)%3==0 && (i%10)!=0) {
				hasnum = true;
				System.out.print("-");
			}
			if(!hasnum) {
				System.out.printf("%d", i);
			}
			System.out.print(" ");
		}
		sc.close();
	}
}