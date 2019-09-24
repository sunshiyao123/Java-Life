package StackTest;
import java.util.Stack;

/**
 * 双栈解法
 * 一个栈存放数据，一个栈存放最小值
 */
public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    public void push(int x) {
        //当放最小数的栈为空
        //或者输入的数小于等于最小栈的栈顶元素 则放入最小栈
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
            dataStack.push(x);
        }
        else
            dataStack.push(x);
    }

    public void pop() {
        //这里比较两个值使用的是equals()方法，因为使用的Integer
        if (minStack.peek().equals(dataStack.peek())) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
