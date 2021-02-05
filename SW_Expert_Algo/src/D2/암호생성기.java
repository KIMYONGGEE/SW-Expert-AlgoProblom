package www.swexpert;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = 10;
		for (int tc = 0; tc < TC; tc++) {
			int tcnum = sc.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			for (int i = 0; i < 8; i++) {
				int tempnum = sc.nextInt();
				queue.offer(tempnum);
			}
			int delcount = 1;
			while (true) {
				if (queue.peek() - delcount <= 0) {
					queue.poll();
					queue.offer(0);
					break;
				} else {
					queue.offer(queue.poll() - delcount);
					delcount++;
					if (delcount > 5) {
						delcount = 1;
					}
				}
			}
			System.out.printf("#%d ", tcnum);
			while (!queue.isEmpty()) {
				System.out.printf("%d ", queue.poll());// 빌때까지 뺀다
			}
			System.out.println();

		}
	}

}
