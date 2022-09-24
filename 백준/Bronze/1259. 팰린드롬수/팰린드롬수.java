import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String a = sc.next();
			if (a.equals("0")) {
				break;
			}
			boolean rev = true;
			for(int i = 0; i<a.length()/2; i++) {
				if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
					rev = false;
					break;
				}
			}
			if (rev)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}
}
