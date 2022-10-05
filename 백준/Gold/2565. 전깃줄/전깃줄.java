import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 건물 높이
		Cable[] arr = new Cable[n];
		int dp[] = new int [n];
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stt = Integer.parseInt(st.nextToken());
			int ed = Integer.parseInt(st.nextToken());
			arr[i] = new Cable(stt, ed);
		}
		Arrays.sort(arr);
		
		dp[0] = 1;
		for(int i = 0; i<n; i++) {
			dp[i] = 1;
			for(int j = 0; j<i; j++) {
				if(arr[i].end>arr[j].end) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max = -1;
		for(int i = 0; i<n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(n-max);
		br.close();
	}
	
	static class Cable implements Comparable<Cable> {
		int start;
		int end;

		public Cable(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Cable o) {
			return this.start - o.start;
		}
	}

}
