import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int [n];

        for (int a = m; a>0; a--) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int b = i-1; b<j; b++) {
                basket[b] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c<n; c++) {
            sb.append(basket[c]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
