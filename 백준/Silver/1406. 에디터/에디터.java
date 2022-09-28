import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> line = new Stack<>();
		Stack<String> edit = new Stack<>();
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			line.push(String.valueOf(str.charAt(i)));
		}
		int n = Integer.parseInt(br.readLine());
		for (int t = 0; t < n; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String action = st.nextToken();
			switch (action) {
			case "P":
				String input = st.nextToken();
				line.push(input);
				break;
			case "L":
				if(!line.isEmpty()) {
					edit.push(line.pop());
				}
				break;
			case "B":
				if(!line.isEmpty()) {
					line.pop();
				}
				break;
			case "D":
				if(!edit.isEmpty()) {
					line.push(edit.pop());
				}
				break;
			}
		}
		while(!line.isEmpty()) {
			edit.push(line.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!edit.isEmpty()) {
			sb.append(edit.pop());
		}
		System.out.println(sb.toString());
		br.close();
	}

}
