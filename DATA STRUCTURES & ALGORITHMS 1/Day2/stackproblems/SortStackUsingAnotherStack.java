package DSA.Day2.stackproblems;

import java.util.Stack;

public class SortStackUsingAnotherStack {
	static Stack<Integer> sort(Stack<Integer> s) {
     Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {
            int x = s.pop();
            while (!temp.isEmpty() && temp.peek() > x)
                s.push(temp.pop());
            temp.push(x);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(33); 
        s.push(12); 
        s.push(46);
        System.out.println(sort(s));
    }
}
