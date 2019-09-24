package QueueTest;

import java.util.Stack;

public class LeetCode232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        myQueue.pop();
        System.out.println(myQueue.peek());
        myQueue.pop();
        System.out.println(myQueue.empty());
    }
}
class MyQueue {
    private Stack dataStack = new Stack();
    private Stack tempStack = new Stack();
    private int size;
    /** Initialize your data structure here. */
    public MyQueue() {
        dataStack = new Stack();
        tempStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        dataStack.push(x);
        size++;
        return;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        size--;
        for (int i = 0;i < size;i++) {
            tempStack.push(dataStack.pop());
        }
        int result = (int) dataStack.pop();
        for (int i = 0; i < size;i++) {
            dataStack.push(tempStack.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        for (int i = 0;i < size;i++) {
            tempStack.push(dataStack.pop());
        }
        int result = (int) tempStack.peek();
        for (int i = 0; i < size;i++) {
            dataStack.push(tempStack.pop());
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
    }
}
