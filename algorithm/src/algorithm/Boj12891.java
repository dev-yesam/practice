package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12891 {
	static int[] nowArr;
	static int[] checkArr;
	
	private static void addDna(char dna) {
		switch (dna) {
		case 'A':
			nowArr[0]++;
			break;
		case 'C':
			nowArr[1]++;
			break;
		case 'G':
			nowArr[2]++;
			break;
		case 'T':
			nowArr[3]++;
			break;
		}
	}
	
	private static void removeDna(char dna) {
		switch (dna) {
		case 'A':
			nowArr[0]--;
			break;
		case 'C':
			nowArr[1]--;
			break;
		case 'G':
			nowArr[2]--;
			break;
		case 'T':
			nowArr[3]--;
			break;
		}
	}
	
	private static boolean checkDna() {
		if (nowArr[0] >= checkArr[0] && nowArr[1] >= checkArr[1] && nowArr[2] >= checkArr[2] && nowArr[3] >= checkArr[3]) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 전체문자열 길이 S , 부분문자열 길이 P
		int S = Integer.parseInt(st.nextToken()); // 전체 문자열 길이
		int P = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
		
		// 임의의 전체 문자열 
		char[] totalString = br.readLine().toCharArray();
		
		// 부분 문자열에 들어가야하는 최소 개수. A C G T  -> checkArr[]  0->A, 1->C, 2->G, 3->T
		checkArr = new int[4]; 
		
		// 현재 문자열에 들어있는 수 A C G T
		nowArr = new int[4];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		// 가능한 비밀번호 수 count
		int count = 0;
		
		// 슬라이딩 처음. 기본
		for(int i=0; i<P; i++) {
			char nowDna = totalString[i];
			addDna(nowDna);
		}
		// 현재 카운트
		if (checkDna()) {
			count++;
		}
		
		// 슬라이딩 다음으로.
		for(int i=P; i<S; i++) {
			char minusDna = totalString[i-P];
			removeDna(minusDna);
			char plusDna = totalString[i];
			addDna(plusDna);
			if (checkDna()) {
				count++;
			}
		}
		
		// 출력
		System.out.println(count);
		br.close();
		
	}

}
