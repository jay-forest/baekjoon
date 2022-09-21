import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> kee = new ArrayList<>(9);
		int sum = 0;
	
		for (int i = 0; i<9; i++) {
		int height = sc.nextInt();
		kee.add(i, height);
		sum = sum + height;
		}
		
		int total = 0;
		out: for (int i = 0; i<9; i++) {
			for (int j = i+1; j<9; j++) {
				total = sum - (kee.get(i) + kee.get(j));
				
				if (total == 100) {
					kee.remove(j); // j index 크기가 더 크기 때문에 먼저 remove
					kee.remove(i);
					break out;
				}
			}
		}
		Collections.sort(kee);
		
		for (int i=0; i<7; i++) {
			System.out.println(kee.get(i));
		}
	}
}
