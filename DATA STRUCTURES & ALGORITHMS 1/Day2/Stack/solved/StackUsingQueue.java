package DSA.Day2.Stack.solved;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {
        q1.add(x);
    }

    // Pop operation
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Move elements except last
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Last element is the stack top
        int popped = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public static void main(String[] args) {
    	System.out.println("Stack using Queue:");
      StackUsingQueue st = new StackUsingQueue();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop()); // 30
        System.out.println(st.pop()); // 20
    }
}
