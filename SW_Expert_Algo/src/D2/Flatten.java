package com.swexpert;

import java.util.Scanner;

public class Flatten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = 10;
		int[] ans = new int[test];

		int[] map = new int[100];

		for (int test_case = 0; test_case < test; test_case++) {
			int dump = sc.nextInt();
			for (int i = 0; i < map.length; i++) {
				map[i] = sc.nextInt();
			}
			int max = map[0];
			int min = map[0];
			
			int maxcheckindex=0;
			int mincheckindex=0;
			for (int dumproof = 0; dumproof < dump+1; dumproof++) {
				for (int i = 0; i < map.length; i++) {
					if (min > map[i]) {
						min = map[i];
						mincheckindex = i;
					}
					if (max < map[i]) {
						max = map[i];
						maxcheckindex = i;
					}
				}
				min++;
				max--;
				map[mincheckindex] =min;
				map[maxcheckindex] = max;

				ans[test_case] = max - min;
				
				if (min == max) {
					ans[test_case] = 0; 
					break;
				}
			}

		}
		
		for(int i =0; i< ans.length;i++) {
			System.out.printf("#%d %d\n", i + 1, ans[i]+2);
		}
	}
}
