package DSA.Day2.stackproblems;

import java.util.Stack;

public class QueueUsingStack {
	 Stack<Integer> s1 = new Stack<>();
	 Stack<Integer> s2 = new Stack<>();

	    // Enqueue operation
	    void enqueue(int x) {
	        s1.push(x);
	    }

	    // Dequeue operation
	    int dequeue() {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1;
	        }

	        if (s2.isEmpty()) {
	            while (!s1.isEmpty()) {
	                s2.push(s1.pop());
	            }
	        }

	        return s2.pop();
	    }
    public static void main(String[] args) {
    	 System.out.println("Queue using Stack:");
         QueueUsingStack q = new QueueUsingStack();
         q.enqueue(1);
         q.enqueue(2);
         q.enqueue(3);
         System.out.println(q.dequeue()); // 1
         System.out.println(q.dequeue()); // 2
    }
}
