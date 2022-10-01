import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> dic = new HashMap<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] diction = new String[n + 1];
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			dic.put(name, i+1);
			diction[i + 1] = name;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String search = sc.next();
			boolean isnum = true;
			for (int k = 0; k < search.length(); k++) {
				if (search.charAt(k)-'0' < 0 || search.charAt(k)-'0' > 9) {
					isnum = false;
					break;
				}
			}
			if(isnum) {
				int s = Integer.parseInt(search);
				sb.append(diction[s]).append("\n");
			} else {
				sb.append(dic.get(search)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

}
