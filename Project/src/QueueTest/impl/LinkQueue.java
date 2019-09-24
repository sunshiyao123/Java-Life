package QueueTest.impl;

import QueueTest.Queue;

public class LinkQueue<E> implements Queue<E> {
    private class Node {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    //头节点
    private Node head = null;
    private Node tail = null;
    private int size;
    @Override
    public void emQueue(E e) {
        Node newNode = new Node(e,null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (size == 1){
            newNode.next = tail;
            tail = newNode;
            head.next = newNode;
        } else {
            newNode.next = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return null;
        } else {
            E temp = head.data;
            head = head.next;
            return temp;
        }
    }

    @Override
    public E peek() {
        if (isEmpty()){
            System.out.println("队列为空");
            return null;
        }
        return head.data;
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
