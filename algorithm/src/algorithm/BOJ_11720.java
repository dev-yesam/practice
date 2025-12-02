package algorithm;

import java.util.Scanner;

public class BOJ_11720 {
	public static void main(String[] args) {
		// boj 11720
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			sum += (cNum[i] - '0');
		}
		System.out.println(sum);
	}
}	
