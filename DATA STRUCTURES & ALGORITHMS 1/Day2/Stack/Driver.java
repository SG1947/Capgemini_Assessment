package DSA.Day2.Stack;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Stack;

public class Driver {
public static void main(String[] args) {
	MyStack st = new MyStack(3);
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	System.out.println(st.peek());
	System.out.println(st.pop());
	System.out.println(st.peek());
	ArrayDeque<Integer>st1=new ArrayDeque<Integer>();
	st1.push(2);
	st1.push(3);
	System.out.println(st1.pop());
	System.out.println(st1.peek());
	
}
}
