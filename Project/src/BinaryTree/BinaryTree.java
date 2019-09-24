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

    /**
     * 层序遍历
     */
    void levelOrder();


    E getMin();
    E getMax();
    E removeMin();
    E removeMax();

    /**
     * 移除指定位置元素
     * @param e
     * @return
     */
    void remove(E e);
    int size();
    
}
