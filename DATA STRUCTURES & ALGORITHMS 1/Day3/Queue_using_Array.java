package DSA.Day3;

public class Queue_using_Array {
        int[] q = new int[5];
        int front = 0, rear = -1;

        void enqueue(int x) {
            if (rear == q.length - 1) return;
            q[++rear] = x;
        }

        int dequeue() {
            if (front > rear) return -1;
            return q[front++];
        }
    
}
