package DSA.Day2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	class Parenthesis{
	public boolean isValid(String s) {
		Stack<Character>st=new Stack<>();
		for(char ch : s.toCharArray()) {
			if(ch=='[' || ch=='{' || ch=='(') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) return false;
				char top=st.pop();
				if(ch==']'&& top!='[') return false;
				if(ch=='}'&& top!='{') return false;
				if(ch==')'&& top!='(') return false;
			}
		}
			return st.isEmpty();
	}
	}
	
	public static void main(String[] args) {
	ValidParenthesis vpt=new ValidParenthesis();
	ValidParenthesis.Parenthesis pt=vpt.new Parenthesis();
     Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an expression:");
     String str=userInput.nextLine();
     if(pt.isValid(str)) System.out.println("Valid parenthesis");
     else System.out.println("Invalid parenthesis");

	}

}
