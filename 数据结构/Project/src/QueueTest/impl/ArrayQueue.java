package QueueTest.impl;

import QueueTest.Queue;

public class ArrayQueue<E> implements Queue<E> {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;
    private int maxSize;
    public ArrayQueue(int l) {
        elements = new Object[l+1];
        maxSize = l;
    }
    @Override
    public void emQueue(E e) {
        if (tail == maxSize){
            if (head == 0) {
                System.out.println("队列已满");
            } else {
                for (int i = head;i < size;i++) {
                    elements[head-1] = elements[head];
                    tail--;
                }
            }
        } else {
            elements[tail++] = e;
            size++;
        }
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return null;
        } else {
            E temp = (E) elements[head];
            elements[head] = null;
            head++;
            return temp;
        }
    }

    @Override
    public E peek() {
        return (E) elements[head];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
