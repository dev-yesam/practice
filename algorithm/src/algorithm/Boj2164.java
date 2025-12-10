package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2164 {
	public static void main(String[] args) {
		// n (maximum 500,000) -> n~ nlogn
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			myQueue.add(i+1);
		}
		
		int answer = myQueue.poll();
		while(!myQueue.isEmpty()) {
			// move to rear
			myQueue.add(myQueue.poll());
			// anwer change
			answer = myQueue.poll();
		}
		System.out.println(answer);
		sc.close();
	}
}
