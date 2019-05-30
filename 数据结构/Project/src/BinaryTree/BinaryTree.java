package BinaryTree;

public interface BinaryTree<E> {

    void add(E e);
    boolean contains(E e);

    /**
     * 前序遍历
     */
    void preOrder();

    /**
     * 中序遍历
     */
    void inOrder();

    /**
     * 后序遍历
     */
    void postOrder();


    E getMin();
    E getMax();
    E removeMin();
    E removeMax();

    /**
     * 移除指定位置元素
     * @param e
     * @return
     */
    boolean remove(E e);
    int size();
    
}
