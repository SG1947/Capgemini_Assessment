package DSA.Day2.stackproblems;

import java.util.Stack;

public class MinStack {
	Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    void push(int x) {
        st.push(x);
        if (minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
    }

    int pop() {
        if (st.isEmpty()) return -1;

        int removed = st.pop();
        if (removed == minSt.peek()) {
            minSt.pop();
        }
        return removed;
    }

    int getMin() {
        if (minSt.isEmpty()) return -1;
        return minSt.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println(ms.getMin()); // 2
        ms.pop();
        System.out.println(ms.getMin()); // 3
    }
}
