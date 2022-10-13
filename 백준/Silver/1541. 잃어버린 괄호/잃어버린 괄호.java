import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int minus = Integer.MAX_VALUE;
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)-'0'>=0) {
				sb.append(str.charAt(i));
			} else {
				list.add(sb.toString());
				sb = new StringBuilder();
				if(str.charAt(i)=='-') {
					minus = Math.min(minus, list.size()-1);
				}
			}
		}
		list.add(sb.toString());
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			if(i<=minus) {
				sum+=Integer.valueOf(list.get(i));
			} else {
				sum-=Integer.valueOf(list.get(i));
			}
//			System.out.printf("%d %d\n", i, sum);
		}
		System.out.println(sum);

	}

}
