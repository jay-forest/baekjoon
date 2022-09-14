import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<int[]> house;
	static ArrayList<int[]> chicken;
	static boolean[] run;
	static int n;
	static int m;
	static int mindis = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int city[][] = new int[n][n];
		house = new ArrayList<>();
		chicken = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				city[i][j] = sc.nextInt();
				if (city[i][j] == 1) {
					house.add(new int [] {i, j});
				} else if (city[i][j] == 2) {
					chicken.add(new int [] {i, j});
				}
			}
		}
		run = new boolean[chicken.size()];
		combination(0,0);
		System.out.println(mindis);
		sc.close();

	}

	static void combination(int index, int store) {
		if (store == m) {
			distance(run);
		}

		for (int i = index; i < run.length; i++) {
			run[i] = true;
			combination(i+1, store + 1);
			run[i] = false;
		}
	}
	
	static int distance(boolean[] run) {
		int dissum = 0;
		for (int i = 0; i < house.size(); i++) {
			int dis = Integer.MAX_VALUE;
			for (int j = 0; j < run.length; j++) {
				if (run[j]) {
					int a = Math.abs(house.get(i)[0]-chicken.get(j)[0]);
					int b = Math.abs(house.get(i)[1]-chicken.get(j)[1]);
					dis = Math.min(dis, a+b);
				}
			}
			dissum = dissum + dis;
			
		}
		mindis = Math.min(mindis, dissum);
		return mindis;
	}
}