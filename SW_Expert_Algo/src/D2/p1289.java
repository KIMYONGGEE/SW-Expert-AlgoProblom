package com.swexpert;

import java.util.Scanner;

public class p1289 {

	public static void main(String[] args) {
		
		// 생각을 먼저 해보자 으흠.. 비트연산? 스트링? 
		// 비트연산은 ㅋㅋ 아닐것 같다 스트링을통해 입력받고 charat으로 접근해보자 
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		int[] ans = new int[T];
		
		for (int test_case = 0; test_case < T; test_case++) {
			String data = sc.next();
			int count = 0;
			
			//char a = '0';
			int checkchar = '0';
			
			
			for (int i = 0; i < data.length(); i++) {
				//string의 인덱스를 접근하기 위해 charAt
				if (data.charAt(i) != (char)checkchar) {
					checkchar = data.charAt(i);
					count++;
				}
			}

			ans[test_case] = count;
		}
		
		for(int i =0; i< ans.length;i++) {
			System.out.printf("#%d %d\n", i + 1, ans[i]);
		
		}

	}

}

