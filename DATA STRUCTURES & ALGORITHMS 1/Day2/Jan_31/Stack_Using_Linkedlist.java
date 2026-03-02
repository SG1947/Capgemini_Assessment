package Stack;

public class Stack_Using_Linkedlist {
    class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    class StackLL {
        StackNode top;

        void push(int x) {
            StackNode node = new StackNode(x);
            node.next = top;
            top = node;
        }

        int pop() {
            if (top == null) return -1;
            int val = top.data;
            top = top.next;
            return val;
        }
    }

}