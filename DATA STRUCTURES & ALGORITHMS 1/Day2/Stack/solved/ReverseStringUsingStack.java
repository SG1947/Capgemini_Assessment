package DSA.Day2.Stack.solved;

import java.util.Stack;

public class ReverseStringUsingStack {
	static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray())
            stack.push(ch);

        String result = "";
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
