package algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// BOJ 30802
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] sizes = new int[6];
		for(int i = 0; i < 6; i++) {
			sizes[i] = sc.nextInt();
		}
		
		int tshirtsNumber = sc.nextInt();
		int pensNumber = sc.nextInt();
		
		int minTshirtSetsNumber = 0;

		for(int i = 0; i < 6; i++) {
			minTshirtSetsNumber += sizes[i] / tshirtsNumber;
			if (sizes[i] % tshirtsNumber != 0){
				minTshirtSetsNumber ++;
			}
		}

		
		int maxPenSetNumber = N / pensNumber;
		int junkPenNumber = N % pensNumber;
		
		System.out.println(minTshirtSetsNumber);
		System.out.println(maxPenSetNumber + " " + junkPenNumber);
		
		sc.close();
	
	}
}	
