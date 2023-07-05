import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int [n];

        for (int a = 0; a<n; a++) {
            basket[a] = a + 1;
        }
        for (int b = 0; b<m; b++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tem = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tem;
        }

        StringBuilder sb = new StringBuilder();
        for (int c = 0; c<n; c++) {
            sb.append(basket[c]).append(" ");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
