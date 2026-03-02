package DSA.Day2.Stack.solved;

import java.util.Stack;

public class DuplicateParentheses {
	static boolean hasDuplicate(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                }
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            } 
            else {
                st.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate("((a+b))"));
    }
}
