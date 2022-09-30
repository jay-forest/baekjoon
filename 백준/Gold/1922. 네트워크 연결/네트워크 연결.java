import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		List<Edge> list = new ArrayList<>();
		
		for(int i = 0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			list.add(new Edge(start, end, cost));
		}
		
		Collections.sort(list);
		
		pre = new int[n+1];
		// make-set 초기상태에는 모두가 각자 그룹의 루트노드다~
		for(int i = 1; i<=n; i++) {
			pre[i] = i;
		}
		int cnt = 0;
		int idx = 0;
		int sum = 0;
		while(cnt<n-1) {
			Edge edge = list.get(idx);
			int st = edge.st;
			int ed = edge.ed;
			
			
			idx++;
			if(find(st)==find(ed)) {
				continue;
			}
			union(st, ed);
			sum+=edge.cost;
			cnt++;
			
		}
		System.out.println(sum);
		
		
	}
	
	//find-set
	static int [] pre;
	static int find(int i) {
		if(pre[i] !=i) {
			pre[i] = find(pre[i]);
		}
		return pre[i];
	}
	
	//union
	static void union(int i, int j) {
		pre[find(i)] = find(j);
	}
	
	static class Edge implements Comparable<Edge> {
		int st;
		int ed;
		int cost;
		public Edge(int st, int ed, int cost) {
			super();
			this.st = st;
			this.ed = ed;
			this.cost = cost;
			
		}
		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

}
