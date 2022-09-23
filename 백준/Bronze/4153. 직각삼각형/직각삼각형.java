import java.util.Scanner;

public class Main {
	static int a;
	static int b;
	static int c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(c==0) {
				break;
			}
			
			boolean right = false;
			
			if(a>=b) {
				if(a>=c) {
					if(a*a==c*c + b*b) {
						right = true;
					}
				}
			} else {
				if(b>=c) {
					if(b*b==c*c + a*a) {
						right = true;
					}
				} else {
					if(c*c==a*a + b*b) {
						right = true;
					}
				}
			}
			
			
			if(right) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}