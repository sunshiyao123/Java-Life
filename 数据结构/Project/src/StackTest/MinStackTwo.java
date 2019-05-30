package StackTest;

import java.util.Stack;

/**
 * 单栈解法
 * 使用一个栈既要知道数据又要知道最小值
 * 元素A：具体的数据
 * 元素B：最小值
 */
public class MinStackTwo {
    private Stack<Integer> Stack;
    public MinStackTwo() {
        Stack = new Stack<>();
    }
    public void push(int x) {
        if (Stack.isEmpty()) {
            Stack.push(x);
            Stack.push(x);
        } else {
            int temp = Stack.peek();
            Stack.push(x);
            if (x < temp) {
                Stack.push(x);
            } else {
                Stack.push(temp);
            }
        }
    }

    public void pop() {
        Stack.pop();
        Stack.pop();
    }

    public int top() {
        int temp = Stack.pop();
        int result = Stack.pop();
        Stack.push(result);
        Stack.push(temp);
        return result;
    }

    public int getMin() {
        return Stack.peek();
    }
}

