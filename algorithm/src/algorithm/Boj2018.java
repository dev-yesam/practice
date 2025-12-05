package algorithm;

import java.util.Scanner;

public class Boj2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int startIndex = 1; // 숫자에 맞춰서 인덱스 수정
		int endIndex = 1;
		int sum = 1;
		while(true) {
			if(sum < N) { 	// 작다면, 
				endIndex++;
				sum += endIndex;
			} else if(sum > N) { // 크다면,
				startIndex++;
				sum -= startIndex-1;
			} else {  // 같다면,
				count++;
				endIndex++;
				sum += endIndex;
			}
			// 종료조건
			if(endIndex > N) {
				break;
			}
		}
		System.out.println(count);
	}
	
}
