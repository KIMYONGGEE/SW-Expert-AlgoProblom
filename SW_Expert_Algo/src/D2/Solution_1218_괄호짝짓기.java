package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1218_괄호짝짓기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = 10;
		for (int tc = 1; tc <= TC; tc++) {
			int len = Integer.parseInt(br.readLine());

			char[] input = br.readLine().toCharArray();
			Stack<Character> stack = new Stack<>();

			int ans = 1;
			for (int i = 0; i < len; i++) {
				char ch = input[i];
				if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
					stack.push(ch);
				} else { // 닫히는 괄호인 경우
					if(stack.isEmpty()) { // 닫히는 괄호가 나왔는데 스택이 비었어 ?! 짝안맞음!
						ans = 0;
						break;
					}
					char open = stack.pop();
					
					switch(ch) {
					case ')':	if(open!='(')	ans = 0;	break;
					case ']':	if(open!='[')	ans = 0;	break;
					case '}':	if(open!='{')	ans = 0;	break;
					case '>':	if(open!='<')	ans = 0;	break;
					}
				}
				if(ans==0) // 짝 안맞았나보다 그만하자.
					break;
			}
			
			if(!stack.isEmpty())
				ans = 0;
			
			System.out.println("#"+tc+" "+ans);
		}
	}
}




