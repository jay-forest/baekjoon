import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        int sum = 0;
        for (int i = 0; i< dial.length(); i++) {
            int a = (int) dial.charAt(i)-'A';
            int num = a/3+3;
            if (a==18) {
                num = 8;
            } else if (a==21) {
                num = 9;
            } else if (num == 11) {
                num = 10;
            }
            sum += num;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
