package www.swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정사각형방 {
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {

			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int max = Integer.MIN_VALUE;
			int index = Integer.MAX_VALUE;
			
			
			int[] ansArr = new int[100000];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					count = 0;
					int number = map[i][j];
					DFS(map, i, j, N, number);
					count++;
					ansArr[number] = count;
				}
			}
			for (int i = 0; i < N*N; i++) {
				if (max < ansArr[i]) {
					max = ansArr[i];
					index = i;
				}
			}
			System.out.println("#" + tc + " " + index + " " + max);

		} 
	} 


    private static void DFS(int[][] map, int x, int y, int N, int number) {
 
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] - number == 1) {
            	count++;
                DFS(map, nx, ny, N, map[nx][ny]);
            }
        }
        
    } 
}
