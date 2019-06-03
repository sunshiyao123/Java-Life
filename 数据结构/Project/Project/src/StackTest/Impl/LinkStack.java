package StackTest.Impl;

import StackTest.Stack;

/**
 * 链式栈，基于链表实现
 * @param <T>
 */
public class LinkStack<T> implements Stack<T> {
    //节点类
    private class Node {
        private T t;
        private Node next;
        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }
    //栈顶元素
    private Node top;
    private int currentSize;
    @Override
    public boolean push(T t) {
        //创建一个新的头节点
        Node newNode = new Node(t, null);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        currentSize++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("当前栈为空");
            return null;
        }
        //将节点中的数据取出来
        T result = top.t;
        top = top.next;
        currentSize--;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("当前栈为空");
            return null;
        }
        //返回节点中的数据
        return (T) top.t;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize==0;
    }
}
