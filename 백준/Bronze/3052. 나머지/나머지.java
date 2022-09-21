import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rest = new int[10];
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i<10; i++) {
			rest[i] = sc.nextInt();
			num.add(rest[i]%42);
		}
		Set<Integer> temp = new HashSet<>(num);
		System.out.println(temp.size());
	}
}
