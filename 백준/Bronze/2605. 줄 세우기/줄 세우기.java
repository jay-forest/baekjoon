import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		
		for (int i = 0; i<n; i++) {
			int odr = sc.nextInt();
			list.add(odr, i+1);
		}
		Collections.reverse(list);
		
		for(Integer i : list) {
			System.out.printf("%d ", i);
		}
	}

}
