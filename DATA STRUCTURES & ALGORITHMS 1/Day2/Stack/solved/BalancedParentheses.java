package DSA.Day2.Stack.solved;

import java.util.Stack;

public class BalancedParentheses {
	 static boolean isBalanced(String s) {
	  Stack<Character> st = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[')
	                st.push(ch);
	            else {
	                if (st.isEmpty()) return false;
	                char open = st.pop();
	                if (ch == ')' && open != '(') return false;
	                if (ch == '}' && open != '{') return false;
	                if (ch == ']' && open != '[') return false;
	            }
	        }
	        return st.isEmpty();
	    }

	    public static void main(String[] args) {
	        System.out.println(isBalanced("{[()]}"));
	    }
    
}

