package BinaryTree.Impl;

import BinaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> implements BinaryTree<E> {


    @Override
    public void add(E e) {
        if (root == null) {
            Node node = new Node(e);
            root = node;
            size++;
        }
        //递归寻找插入位置
        add(root,e);
    }

    /**
     * 以指定的Node为根节点，插入指定元素e
     * compareTo()方法，>0时当前对象大于参数。=0时相等。<0时当前对象小于参数
     * @param e
     * @return
     */
    private void add(Node node,E e) {
        if (node.data.compareTo(e) == 0) {
            return;
        } else if (node.data.compareTo(e) < 0 && node.right == null) {
            Node newNode = new Node(e);
            node.right = newNode;
            size++;
        } else if (node.data.compareTo(e) > 0 && node.left == null) {
            Node newNode = new Node(e);
            node.left = newNode;
            size++;
        } else if (node.data.compareTo(e) < 0) {
            add(node.right, e);
        } else {
            add(node.left, e);
        }

    }









    @Override
    public boolean contains(E e) {
        if (root == null) {
            return false;
        }
        return contains(root,e);
    }

    /**
     * 递归查找指定元素
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node,E e) {
        if (node == null) {
            return false;
        }
        if (node.data.compareTo(e) == 0) {
            return true;
        }
        if (node.data.compareTo(e) > 0) {
            return contains(node.left,e);
        }
        if (node.data.compareTo(e) < 0) {
            return contains(node.right,e);
        }
        return false;
    }


    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public E getMin() {
        return null;
    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        E data;
        Node left;
        Node right;
        public Node(E data) {
            this.data = data;
        }
    }
    //根节点
    private Node root;
    //二叉树节点个数
    private int size;

}
