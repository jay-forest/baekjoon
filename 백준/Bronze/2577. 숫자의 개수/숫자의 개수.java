import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int onetonine [] = new int [10];
		int num = a*b*c;
		String line = Integer.toString(num);
		for(int i = line.length()-1; i>0; i--) {
			int k = num/(int) Math.pow(10, i);
			onetonine[k] += 1;
			num -= k*(int) Math.pow(10, i);
		}
		onetonine[num] +=1;
		for(int i = 0; i<10; i++) {
			System.out.println(onetonine[i]);
		}
		
	}

}
