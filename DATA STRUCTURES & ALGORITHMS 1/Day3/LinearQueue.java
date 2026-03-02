package DSA.Day3;


import java.util.Scanner;

class LinearQueue {
    private int[] queue;
    private int front, rear, capacity;

    // Q1: Implement a linear queue using array
    public LinearQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Q4: Check whether the queue is empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Q5: Check whether the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Q2: Enqueue (insert) an element
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = value;
        System.out.println(value + " inserted into queue.");
    }

    // Q3: Dequeue (delete) an element
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot delete.");
            return;
        }
        System.out.println(queue[front] + " removed from queue.");
        front++;
    }

    // Q6: Display all elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Q7: Get the front element (peek)
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    // Q8: Count number of elements in the queue
    public int count() {
        if (isEmpty()) {
            return 0;
        }
        return (rear - front + 1);
    }

    // Q9: Search an element in the queue
    public void search(int key) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            if (queue[i] == key) {
                System.out.println(key + " found at position " + (i - front + 1));
                return;
            }
        }
        System.out.println(key + " not found in queue.");
    }

    // Q10: Find maximum element in the queue
    public void findMax() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int max = queue[front];
        for (int i = front + 1; i <= rear; i++) {
            if (queue[i] > max) {
                max = queue[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }

    // Q11: Reset / clear the queue
    public void clear() {
        front = -1;
        rear = -1;
        System.out.println("Queue cleared successfully.");
    }



    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.peek();
        System.out.println("Total elements: " + q.count());

        q.search(20);
        q.findMax();

        q.clear();
        q.display();
    }
}
