package Week3.collections;

import java.util.PriorityQueue;

public class priority_queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		  pq.offer(-9);
		  pq.offer(27);
		  pq.offer(-56);
		  pq.offer(40);
		  System.out.println(pq);
		  System.out.println(pq.poll());
		  System.out.println(pq);
		  System.out.println(pq.poll());
		  System.out.println(pq);
		  System.out.println(pq.poll());
		  System.out.println(pq);
		  System.out.println(pq.poll());
		  System.out.println(pq);

	}
  
  
}
