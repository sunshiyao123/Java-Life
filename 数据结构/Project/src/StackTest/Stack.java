package StackTest;

public interface Stack<T> {
    /**
     * 入栈
     */
    boolean push(T t);
    /**
     * 出栈
     */
    T pop();
    /**
     * 返回栈顶元素,但不出栈
     */
    T peek();
    /**
     * 返回元素个数
     */
    int getSize();

    /**
     * 栈是否为空
     * @return
     */
    boolean isEmpty();
}
