package DSA.Day3;

import java.util.*;

public class ReverseQueue {
	static void revQueue(Queue<Integer> q) {
		 
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.poll());
        }
 
        // Step 2: Move all elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
 
    public static void main(String[] args) {
 
        Queue<Integer> q = new LinkedList<>();
 
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
 
        revQueue(q);
 
        System.out.println(q); // Output: [40, 30, 20, 10]
    }
}
