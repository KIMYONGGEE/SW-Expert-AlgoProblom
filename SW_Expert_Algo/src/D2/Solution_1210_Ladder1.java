package day0205;

import java.util.Scanner;

public class Solution_1210_Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int TC = 10;
		
		int[] di = {0,0,-1}; // 0:right, 1:left, 2:up
		int[] dj = {1,-1,0};
		
		for(int tc=1; tc<=10; tc++) {
			int tmp = sc.nextInt(); // 우리에겐 쓸모없는 테케번호
			
			int[][] map = new int[100][100];
			
			int nowi=99, nowj=-1;
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					map[i][j] = sc.nextInt();
					if(map[i][j]==2) {
						//nowi = i; // 무조건 N-1 일거임. 그걸 0까지 끌어올리면 그때의 j좌표가 답임.
						nowj = j;
					}
				}
			}
			
			while(nowi>0) {
				map[nowi][nowj] = 9;
				
				for(int d=0; d<3; d++) {
					int nexti = nowi + di[d];
					int nextj = nowj + dj[d];
					
					if(nexti<100 && nexti>=0 && nextj<100 && nextj>=0 
							&& map[nexti][nextj]==1) {
						nowi = nexti;
						nowj = nextj;
						break; // d가 right, left, up 순서대로인데 right나 left 방향이 이동가능이면 for를 끝냄.
					}
				}
//				print(map);
			}
			System.out.println("#"+tc+" "+nowj);
		}
	}
	
	static void print(int[][] map) {
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				System.out.print((map[i][j]==9?"*":map[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}
