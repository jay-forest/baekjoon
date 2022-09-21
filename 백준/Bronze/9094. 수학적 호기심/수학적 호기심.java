import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int tc = 0; tc<t; tc++) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         int cnt = 0;
         for(int i = 1; i<n-1; i++) {
            for(int j =i+1; j<n; j++) {
               if(((i*i)+(j*j)+m)%(i*j)==0) {
                  cnt++;
               }
            }
         }
   System.out.println(cnt);
      }
      sc.close();
   }
}