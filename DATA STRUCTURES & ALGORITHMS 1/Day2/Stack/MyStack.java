package DSA.Day2.Stack;
import java.io.*;
public class MyStack{
	private int []arr;
	private int top;
	private int capacity;
	public MyStack(int capacity) {
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	public void push(int x) {
		if(top==capacity-1) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top]=x;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		System.out.print("The popped element is:");
		return arr[top--];
		
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		System.out.print("The topmost element is:");
		return arr[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	

}
