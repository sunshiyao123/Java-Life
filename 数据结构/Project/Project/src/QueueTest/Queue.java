package QueueTest;

public interface Queue<E> {
    /**
     * 入队列
     * @param e 要添加的元素
     */
    void emQueue(E e);

    /**
     * 出队列并返回首元素
     * @return 队首元素
     */
    E deQueue();

    /**
     * 返回队首元素
     * @return 队首元素
     */
    E peek();
    int getSize();
    boolean isEmpty();
}
