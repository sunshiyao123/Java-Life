package StackTest;

public class Test {
    public static void main(String[] args) {
        MinStackTwo minStack = new MinStackTwo();
        minStack.push(1);
        minStack.push(-1);
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
    }
}
