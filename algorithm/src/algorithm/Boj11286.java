package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.PriorityQueue;

public class Boj11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
			// 절대값 작은 데이터 우선 
			// 절대값 같은 경우 음수 우선
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			// 1, -1
			if(first_abs==second_abs) {
				return o1 -o2; 
			}
			return first_abs- second_abs;    // 절대값 작은 값 우선
		});
		for(int i = 0; i < N; i++) {
			int request = Integer.parseInt(br.readLine());
			// 0이면?
			if(request == 0) {
				System.out.println(myQueue.isEmpty()? 0 : myQueue.poll());
			} else {
				myQueue.offer(request);
			}

		}
	}

}
