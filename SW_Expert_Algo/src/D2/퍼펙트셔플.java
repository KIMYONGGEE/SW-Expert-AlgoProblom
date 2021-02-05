package www.swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퍼펙트셔플 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());

			String[] card = new String[N];
			String[] ans = new String[N];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				card[i] = st.nextToken();
			}

			String[] Leftcard;
			String[] Rightcard;

			if (N % 2 == 0) {
				Leftcard = new String[N / 2];
				Rightcard = new String[N / 2];
				int temp = 0;
				for (int i = 0; i < N / 2; i++) {
					Leftcard[i] = card[i];
					temp = i;
				}
				temp++;
				for (int i = 0; i < N / 2; i++) {
					Rightcard[i] = card[temp];
					temp++;
				}

			} else {
				Leftcard = new String[N / 2 + 1];
				Rightcard = new String[N / 2];
				int temp = 0;
				for (int i = 0; i < N / 2 + 1; i++) {
					Leftcard[i] = card[i];
					temp = i;
				}
				temp++;
				for (int i = 0; i < N / 2; i++) {
					Rightcard[i] = card[temp];
					temp++;
				}
			}
			
			System.out.printf("#%d ", tc);
			int Ltemp = 0, Rtemp = 0;
			for (int i = 0; i < N; i++) {
				if ((i + 1) % 2 != 0) {
					System.out.print(Leftcard[Ltemp]+" ");
					Ltemp++;
				} else {
					System.out.print(Rightcard[Rtemp]+" ");
					Rtemp++;
				}

			}
			System.out.println();

		}
	}
}
