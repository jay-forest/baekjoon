import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] A = new int [n];
		int [] proc = new int [n];
		for(int i = 0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i = 0; i<n; i++) {
			if(A[i]>=b) {
			proc[i] = ((A[i]-b)/c)+1;
			if ((A[i]-b)%c!=0)
				proc[i] +=1;
			} else {
				proc[i] = 1;
			}
		}
		long result = 0;
		for(int i = 0; i<n; i++) {
			result = result + proc[i];
		}
		System.out.println(result);
	}
}