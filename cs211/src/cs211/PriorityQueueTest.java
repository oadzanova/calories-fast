package cs211;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Random ran = new Random();
		for (int i = 0; i < 10; i++){
			int data = ran.nextInt(50);
			pq.offer(i);
		}
		pq.offer(null);
		while (!pq.isEmpty()){
			System.out.println(pq.poll());
		}

	}

}
