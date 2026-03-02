package DSA.Day2.stackproblems;

import java.util.Stack;

public class RedundantBrackets {

	    static boolean redundant(String s) {
	        Stack<Character> st = new Stack<>();

	        for (char ch : s.toCharArray()) {

	            if (ch == ')') {
	                boolean hasOperator = false;

	                while (st.peek() != '(') {
	                    char top = st.pop();
	                    if (top == '+' || top == '-' || top == '*' || top == '/') {
	                        hasOperator = true;
	                    }
	                }

	                st.pop(); // remove '('

	                if (!hasOperator) return true;
	            } 
	            else {
	                st.push(ch);
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        System.out.println(redundant("(a+(b))"));
	    }
}
