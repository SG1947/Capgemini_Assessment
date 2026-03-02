package DSA.Day2.stackproblems;

import java.util.Stack;

public class InfixToPostfix {

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

    // Convert infix to postfix
    static String infixToPostfix(String infix) {

        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {

            // If operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // If '(', push to stack
            else if (ch == '(') {
                st.push(ch);
            }

            // If ')', pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop(); // remove '('
            }

            // If operator
            else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+(B*C-D)"));
    }
}
