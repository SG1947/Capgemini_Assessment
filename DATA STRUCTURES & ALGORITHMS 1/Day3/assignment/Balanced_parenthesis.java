package DSA.Day3.assignment;

import java.util.Stack;

public class Balanced_parenthesis {
	public static boolean parenthesisChecker(String exp) {
		Stack<Character> st= new Stack<>();
		for(char ch:exp.toCharArray()) {
			if(ch=='['|| ch=='{'||ch=='(') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) return false;
				int top=st.pop();
				if(top==']' && st.peek()!='[') return false;
				if(top=='}' && st.peek()!='{') return false;
				if(top==')' && st.peek()!='(') return false;
			}
		}
		return st.isEmpty();
	}
  public static void main(String[] args) {
	String exp="([{}])";
	if(parenthesisChecker(exp)) System.out.println("Balanced Parenthesis");
	else System.out.println("Inbalanced Parenthesis");
}
}
