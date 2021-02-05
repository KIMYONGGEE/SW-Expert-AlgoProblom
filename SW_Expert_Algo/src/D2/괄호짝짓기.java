package www.swexpert;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 괄호짝짓기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = 10;
		char[] comp = { '(', ')', '[', ']', '{', '}', '<', '>' };
		int[] ans = new int[TC];
		for (int tc = 0; tc < TC; tc++) {
			int[] cnt = new int[8];
			int datanum = sc.nextInt();
			String data = sc.next();
			for (int i = 0; i < datanum; i++) {
				if (data.charAt(i) == comp[0])
					cnt[0]++;
				else if (data.charAt(i) == comp[1])
					cnt[1]++;
				else if (data.charAt(i) == comp[2])
					cnt[2]++;
				else if (data.charAt(i) == comp[3])
					cnt[3]++;
				else if (data.charAt(i) == comp[4])
					cnt[4]++;
				else if (data.charAt(i) == comp[5])
					cnt[5]++;
				else if (data.charAt(i) == comp[6])
					cnt[6]++;
				else if (data.charAt(i) == comp[7])
					cnt[7]++;
			}
			for (int i = 0; i < cnt.length - 1; i=i+2) {
				if (cnt[i] == cnt[i + 1]) {
					ans[tc] = 1;
				} else{
					ans[tc] = 0;
					break;
				}
			}
			System.out.printf("#%d ", tc+1);
			System.out.println(ans[tc]);
		}

	}

}
