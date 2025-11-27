package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// BOJ 4153
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		while (true) {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			Arrays.sort(arr);
			
			// 종료 조건
			if (arr[0]== 0 && arr[1] == 0 && arr[2] == 0 ) {
				break;
			}
			
			// 직각삼각형 판별
			if (arr[2]*arr[2] == (arr[0]*arr[0] + arr[1]*arr[1])) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}
