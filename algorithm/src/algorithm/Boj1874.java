package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
	public static void main(String[] args) {
		
		
		/*
		 * N : 1부터 N까지 넣을 때 그 수
		 * A[N] : 출력해야할 수 배열
		 * 
		 * int num -> 1~N까지 더해감
		 * for(i=0 -> i=N-1){
		 *   if(num <= A[i])
		 *   	while (num <= A[i]) {
		 *        스택.push(num)
		 *      }
		 *      스택.pop()
		 *      문자열.append("+")
		 *   else 
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		StringBuffer sb = new StringBuffer();
		
		int num = 1;
		Stack<Integer> stack = new Stack<>();
		boolean flag = true;
		// A 배열 하나씩 돌면서,....
		for(int i=0; i<A.length; i++) {
			if(num <= A[i]) {
				while(num <= A[i]) {
					stack.push(num++);
					sb.append("+\n");	
				}
			}
			
			int popElem = stack.pop();
			sb.append("-\n");
			if(popElem > A[i]) {
				flag = false;
				System.out.println("NO");
				break;
			} 
		}
		if(flag) System.out.println(sb.toString());
		
		sc.close();
	}
}
