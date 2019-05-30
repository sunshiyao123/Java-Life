package QueueTest.impl;

import QueueTest.Queue;

public class CircleArrayQueue<E> implements Queue<E> {
    private int size;
    private int head;
    private int tail;
    private int maxSize;
    private E[] elements;

    public CircleArrayQueue(int maxSize) {
//        elements = new E[maxSize];
    }

    @Override
    public void emQueue(E e) {
//        if (head)
    }

    @Override
    public E deQueue() {
        return null;
    }

    @Override
    public E peek() {
        if (head == tail) {
            System.out.println("队列为空");
            return null;
        }
        return elements[head];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail==head;
    }
}
