import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 4; t++) {
			int rec1[] = new int[4];
			int rec2[] = new int[4];
			for (int i = 0; i < 4; i++) {
				rec1[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				rec2[i] = sc.nextInt();
			}
			char position = 'd';
			if (rec1[0] > rec2[0]) { // 직사각형2의 왼쪽 변이 직사각형1의 왼쪽변보다 더 왼쪽에 있을때
				if (rec1[0] < rec2[2]) { // 직사각형2의 오른쪽 변이 1의 왼쪽 변보다 오른쪽일때
					if (!(rec1[1] >= rec2[3]) && !(rec1[3] <= rec2[1])) { // 2의 아랫변이 1의 윗변 아랫변 사이일때
						position = 'a';
					} else if (rec1[1] == rec2[3] || rec1[3] == rec2[1]) { // 2의 윗변 1의 아랫변 또는 2의 아랫변, 1의 윗변이 닿아있을때
						position = 'b';
					}
				} else if (rec1[0] == rec2[2]) {
					if (!(rec1[1] >= rec2[3]) && !(rec1[3] <= rec2[1])) { // 2의 아랫변이 1의 윗변 아랫변 사이일때
						position = 'b';
					} else if (rec1[1] == rec2[3] || rec1[3] == rec2[1]) { // 2의 윗변 1의 아랫변 또는 2의 아랫변, 1의 윗변이 닿아있을때
						position = 'c';
					}
				}
			} else if (rec1[0] <= rec2[0] && rec1[2] > rec2[0]) {
				if (!(rec1[1] >= rec2[3]) && !(rec1[3] <= rec2[1])) { // 2의 아랫변이 1의 윗변 아랫변 사이일때
					position = 'a';
				} else if (rec1[1] == rec2[3] || rec1[3] == rec2[1]) { // 2의 윗변 1의 아랫변 또는 2의 아랫변, 1의 윗변이 닿아있을때
					position = 'b';
				}
			} else if (rec1[2] == rec2[0]) {
				if (!(rec1[1] >= rec2[3]) && !(rec1[3] <= rec2[1])) { // 2의 아랫변이 1의 윗변 아랫변 사이일때
					position = 'b';
				} else if (rec1[1] == rec2[3] || rec1[3] == rec2[1]) { // 2의 윗변 1의 아랫변 또는 2의 아랫변, 1의 윗변이 닿아있을때
					position = 'c';
				}
			}
			System.out.println(position);
		}
        sc.close();
	}
}