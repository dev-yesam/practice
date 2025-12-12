package algorithm;

import java.util.Scanner;

public class Boj1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int numbers[] = new int[N.length()];
		for(int i=0; i<N.length(); i++) {
			numbers[i] = Integer.parseInt(N.substring(i,i+1));
		}
		
		// Selection sort
		for(int i=0; i<N.length()-1; i++) {
			int idx = i; 
			for(int j=i+1; j<N.length(); j++) {
				if(numbers[j] > numbers[idx]) {
					idx = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[idx];
			numbers[idx] = temp;
		}
		
		// Print result
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		
	}

}
