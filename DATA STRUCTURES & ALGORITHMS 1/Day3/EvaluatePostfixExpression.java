package DSA.Day3;

import java.util.Stack;

public class EvaluatePostfixExpression {
	static int evaluate(String exp) {
     Stack<Integer> st = new Stack<>();
        for(int i=0;i<exp.length();i++) {
        	char ch= exp.charAt(i);
        	 if (Character.isDigit(ch))
                 st.push(ch - '0');
          else {
                 int a = st.pop();
                 int b = st.pop();
  
                 switch (ch) {
                     case '+': st.push(b + a); break;
                     case '-': st.push(b - a); break;
                     case '*': st.push(b * a); break;
                     case '/': st.push(b / a); break;
                 }
             }
        }
        
        return st.pop();
    }

    public static void main(String[] args) {
    	   String sb ="231*+9-";
       System.out.println(evaluate(sb));
    }
}
