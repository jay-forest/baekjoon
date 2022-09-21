import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for(int tc = 0; tc<t; tc++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int y = n%h;
			int x = (n/h)+1;
			if(y==0) {
				y=h;
				x=(n/h);
			}
			int rn = y*100 + x;
		System.out.println(rn);	
		}
	}
}