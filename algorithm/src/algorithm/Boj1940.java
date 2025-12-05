package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1940 {
	public static void main(String[] args) throws IOException {
		
		
		// N 15000개. 시간제한 2초. => n^2은 2초 넘는다.
		// NlogN 정도로 해야함
		
		// 정렬 + 투포인터
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 재료 수
		int M = Integer.parseInt(br.readLine()); // 갑옷 만드는 데 필요한 수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int count = 0;
		int start = 0; int end = N-1;
		// 처음이랑 끝 인덱스로 조합 만들 수 있다.
		// 두 수의 합이 M보다 크다? -> 끝--
		// 두 수의 합이 M보다 작다? -> 처음++
		// 두 수의 합이 M과 같다? -> 처음++, 끝--, count++
		
		while(start<end) {
			if(A[start]+A[end] > M) {
				end--;
			} else if(A[start]+A[end] < M) {
				start++;
			} else {
				count++;
				start++; end--;
			}
		}
		System.out.println(count);
	}
	
	
		
		
	
	
}
