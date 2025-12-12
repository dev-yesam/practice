package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numbers[] = new int[N];
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		// Bubble sort
		for(int j = N-1; j > 0; j--) {
			for(int i = 0; i < j; i++) {
				if(numbers[i] > numbers[i+1]) {
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		// Print the result
		for(int i = 0; i < N; i++) {
			System.out.println(numbers[i]);
		}
	}
}
