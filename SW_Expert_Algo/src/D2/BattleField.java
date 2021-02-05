package www.swexpert;

import java.util.Arrays;
import java.util.Scanner;

public class BattleField {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String[] tempmap = new String[x];
			char[][] map = new char[x][y];

			for (int i = 0; i < x; i++) {
				tempmap[i] = sc.next();
			}

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					map[i][j] = tempmap[i].charAt(j);
				}
			}

			int movenum = sc.nextInt();
			String move = sc.next();

			int startx = 0, starty = 0;

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						startx = i;
						starty = j;
					}
				}
			}

			int count = 0;

			while (count < movenum) {

				if (move.charAt(count) == 'S') {
					if (map[startx][starty] == '^') {
						for (int k = startx; k >= 0; k--) {
							if (map[k][starty] == '*') {
								map[k][starty] = '.';
								break;
							} else if (map[k][starty] == '#') {
								break;
							}
						}
					} else if (map[startx][starty] == '>') {
						for (int k = starty; k < y; k++) {
							if (map[startx][k] == '*') {
								map[startx][k] = '.';
								break;
							} else if (map[startx][k] == '#') {
								break;
							}
						}
					} else if (map[startx][starty] == '<') {
						for (int k = starty; k >= 0; k--) {
							if (map[startx][k] == '*') {
								map[startx][k] = '.';
								break;
							} else if (map[startx][k] == '#') {
								break;
							}
						}
					} else if (map[startx][starty] == 'v') {
						for (int k = startx; k < x; k++) {
							if (map[k][starty] == '*') {
								map[k][starty] = '.';
								break;
							}
							if (map[k][starty] == '#') {
								break;
							}
						}
					}
					count++;
				}

				else if (move.charAt(count) == 'U') {// 위로 올라갈때
					if (startx - 1 < 0)
						map[startx][starty] = '^';

					// else if (map[startx - 1][starty] != '*' || map[startx - 1][starty] != '#'||
					// map[startx - 1][starty] != '-')
					else if (map[startx - 1][starty] == '.') {
						map[startx][starty] = '.';
						startx--;
						map[startx][starty] = '^';
					} else
						map[startx][starty] = '^';
					count++;

				}

				else if (move.charAt(count) == 'R') {
					if (starty + 1 >= y)
						map[startx][starty] = '>';
					// else if (map[startx][starty + 1] != '*' || map[startx][starty + 1] != '#'||
					// map[startx][starty + 1] != '-')
					else if (map[startx][starty + 1] == '.') {
						map[startx][starty] = '.';
						starty++;
						map[startx][starty] = '>';
					} else
						map[startx][starty] = '>';
					count++;

				}

				else if (move.charAt(count) == 'L') {
					if (starty - 1 < 0)
						map[startx][starty] = '<';
					// else if (map[startx][starty - 1] != '*' || map[startx][starty - 1] != '#'||
					// map[startx][starty - 1] != '-')
					else if (map[startx][starty - 1] == '.') {
						map[startx][starty] = '.';
						starty--;
						map[startx][starty] = '<';
					} else
						map[startx][starty] = '<';
					count++;

				}

				else if (move.charAt(count) == 'D') {// 아래로 내려갈때
					if (startx + 1 >=x)
						map[startx][starty] = 'v';
					// else if (map[startx + 1][starty] != '*' || map[startx + 1][starty] != '#'||
					// map[startx + 1][starty] != '-')
					else if (map[startx + 1][starty] == '.')

					{
						map[startx][starty] = '.';
						startx++;
						map[startx][starty] = 'v';
					} else
						map[startx][starty] = 'v';
					count++;
				}

			}

			System.out.printf("#%d ", tc + 1);
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.printf("%c", map[i][j]);
				}
				System.out.println();
			}

		} // test case loop

	}

}
