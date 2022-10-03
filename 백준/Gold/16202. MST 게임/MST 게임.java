import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		PriorityQueue<Edge> que = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = i + 1;
			que.add(new Edge(start, end, cost));
		}
		
		boolean able = false;
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < k; t++) {
			PriorityQueue<Edge> temp = new PriorityQueue<>();
			if(able) {
				sb.append(0).append(" ");
				que.poll();
				continue;
			}
			
			
			pre = new int[n + 1];
			// make-set 초기상태에는 모두가 각자 그룹의 루트노드다~
			for (int i = 1; i <= n; i++) {
				pre[i] = i;
			}
			int cnt = 0;
			int sum = 0;
			while (!que.isEmpty()) {
				Edge edge = que.poll();
				int start = edge.start;
				int ed = edge.ed;
				int cost = edge.cost;
				temp.add(new Edge(start, ed, cost));
				if (find(start) == find(ed)) {
					continue;
				}
				union(start, ed);
				sum += edge.cost;
				cnt++;

			}
			if(cnt!=n-1) {
				sum = 0;
			}
			if(sum==0) {
				able = true;
			}
			sb.append(sum).append(" ");
			temp.poll();
            que = temp;
		}
		System.out.println(sb.toString());

	}

	// find-set
	static int[] pre;

	static int find(int i) {
		if (pre[i] != i) {
			pre[i] = find(pre[i]);
		}
		return pre[i];
	}

	// union
	static void union(int i, int j) {
		pre[find(i)] = find(j);
	}

	static class Edge implements Comparable<Edge> {
		int start;
		int ed;
		int cost;

		public Edge(int start, int ed, int cost) {
			super();
			this.start = start;
			this.ed = ed;
			this.cost = cost;

		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

}
