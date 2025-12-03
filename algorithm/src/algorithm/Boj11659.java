package algorithm;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Boj11659 {
	public static void main(String[] args) throws IOException {
//		입력 개수가 많을 때는 BufferedReader 쓰자. 더 빠름
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값이 너무 많아서 int배열로 받기보다 StringTokenizer가 성능 좋음
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		long[]S = new long[suNo + 1]; // 인덱스 맞추기
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i=1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int i=0; i <quizNo; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken());
			int end = Integer.parseInt(stringTokenizer.nextToken());
			
			long answer = S[end] - S[start-1];
			System.out.println(answer);
		}
		
	}
}
