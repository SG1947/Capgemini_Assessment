package DSA.Day2.stackproblems;

import java.util.Stack;

public class InfixToPrefix {

	static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Convert infix to prefix
    static String infixToPrefix(String infix) {

        // Step 1: reverse infix
        StringBuilder reversed = new StringBuilder(infix).reverse();

        // Step 2: swap '(' and ')'
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(')
                reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')')
                reversed.setCharAt(i, '(');
        }

        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        // Step 3: convert reversed infix to postfix
        for (char ch : reversed.toString().toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }
            // Closing bracket
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop();
            }
            // Operator
            else {
                while (!st.isEmpty() && precedence(st.peek()) > precedence(ch)) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        // Step 4: reverse postfix → prefix
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "A+(B*C)";
        System.out.println("Prefix: " + infixToPrefix(infix));
    }
}
