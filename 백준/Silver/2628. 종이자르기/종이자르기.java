import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> wid = new ArrayList<>();
		ArrayList<Integer> hgt = new ArrayList<>();
		wid.add(sc.nextInt());
		wid.add(0);
		hgt.add(sc.nextInt());
		hgt.add(0);
		int t = sc.nextInt();
		for (int l = 0; l < t; l++) {
			int dir = sc.nextInt();
			if (dir == 0) {
				hgt.add(sc.nextInt());
			} else if (dir == 1) {
				wid.add(sc.nextInt());
			}
		}
		Collections.sort(wid);
		Collections.sort(hgt);
		ArrayList<Integer> w1 = new ArrayList<>();
		ArrayList<Integer> h1 = new ArrayList<>();
		for (int w = 1; w < wid.size(); w++) {
			int w2 = wid.get(w) - wid.get(w - 1);
			w1.add(w2);
		}
		for (int h = 1; h < hgt.size(); h++) {
			int h2 = hgt.get(h) - hgt.get(h - 1);
			h1.add(h2);
		}
		int area = 0;
		int max = 0;
		for (int w = 0; w < w1.size(); w++) {
			for (int h = 0; h < h1.size(); h++) {
				area = w1.get(w) * h1.get(h);
				max = Math.max(area, max);
			}
		}
		System.out.println(max);
	}
}
