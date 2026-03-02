package DSA.Day3;

import java.util.Stack;

public class EvaluatePrefixExpression {
	static int evaluate(String exp) {
	     Stack<Integer> st = new Stack<>();

	     for (int i = exp.length() - 1; i >= 0; i--) {
	            char ch = exp.charAt(i);
	            if (Character.isDigit(ch))
	                st.push(ch - '0');
	            else {
	                int a = st.pop();
	                int b = st.pop();
	 
	                switch (ch) {
	                    case '+': st.push(a + b); break;
	                    case '-': st.push(a - b); break;
	                    case '*': st.push(a * b); break;
	                    case '/': st.push(a / b); break;
	                } 
	            }
	        }
	        return st.pop();
	    }

	    public static void main(String[] args) {
	        System.out.println(evaluate("-+9*234"));
	    }
}
