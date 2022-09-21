import java.util.Scanner;

public class Main {
	static boolean voy = false;
	static char solar[][];
	static int n;
	static int m;
	static int di[] = { -1, 0, 1, 0 };
	static int dj[] = { 0, 1, 0, -1 };
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		solar = new char [n][m];
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			for(int j = 0; j<m; j++) {
				solar[i][j] = line.charAt(j);
			}	
		}
		int p = sc.nextInt();
		int q = sc.nextInt();
		p = p-1;
		q = q-1;
		String temp[] = new String [2];
		String max = "0";
		String dir = "";
		out: for (int d = 0; d < 4; d++) {
			temp = travel(p, q, d);
			if (voy) {
				max = "Voyager";
				dir = temp[0];
				break out;
			} else if (Integer.valueOf(max) < Integer.valueOf(temp[1])) {
				max = temp[1];
				dir = temp[0];
			}
		}
		System.out.println(dir);
		System.out.println(max);
	}

	static String[] travel(int i, int j, int d) {
		int cnt = 0;
		int sd = d;
		int si = i;
		int sj = j;
		voy = false;
		String[] output = new String[2];
		out: while (!voy && solar[i][j]!='C') {
			if (cnt!=0 && i==si && j==sj && sd == d) {
				voy = true;
				cnt = 0;
				break;
			} else if (solar[i][j]== '.') {
				i = i + di[d];
				j = j + dj[d];
				cnt++;
			} else if (solar[i][j]=='\\') {
				d = 3 - d;
				i = i + di[d];
				j = j + dj[d];
				cnt++;
			} else if (solar[i][j]=='/') {
				if (d % 2 == 0) {
					d = d + 1;
				} else
					d = d - 1;
				i = i + di[d];
				j = j + dj[d];
				cnt++;
			} else if (solar[i][j]=='C') {
				break;
			}
			if (i < 0 || j < 0 || i >= n || j >= m) {
				break out;
			}
		}
		String stdir = "";
		if (sd == 0) {
			stdir = "U";
		} else if (sd == 1) {
			stdir = "R";
		} else if (sd == 2) {
			stdir = "D";
		} else if (sd == 3) {
			stdir = "L";
		}
		output[0] = stdir;
		output[1] = Integer.toString(cnt);
		return output;
	}
}