package BinaryTree.Impl;

import BinaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> implements BinaryTree<E> {

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


//    @Override
//    public void add(E e) {
//        if (root == null) {
//            Node node = new Node(e);
//            root = node;
//            size++;
//        }
//        //递归寻找插入位置
//        add(root,e);
//    }
//
//    /**
//     * 以指定的Node为根节点，插入指定元素e
//     * compareTo()方法，>0时当前对象大于参数。=0时相等。<0时当前对象小于参数
//     * @param e
//     * @return
//     */
//    private void add(Node node,E e) {
//        if (node.data.compareTo(e) == 0) {
//            return;
//        } else if (node.data.compareTo(e) < 0 && node.right == null) {
//            Node newNode = new Node(e);
//            node.right = newNode;
//            size++;
//        } else if (node.data.compareTo(e) > 0 && node.left == null) {
//            Node newNode = new Node(e);
//            node.left = newNode;
//            size++;
//        } else if (node.data.compareTo(e) < 0) {
//            add(node.right, e);
//        } else {
//            add(node.left, e);
//        }
//
//    }


    /**
     * 优化后的add方法
     * @param e
     */
    @Override
    public void add(E e) {
        root = add(root,e);
    }

    /**
     * 以当前的Node作为根节点，插入元素为e的节点
     * 返回插入后的树的根节点
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node,E e) {
        if (node == null) {
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        if (e.compareTo(node.data) < 0) {
            node.left = add(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = add(node.right,e);
        }
        return node;
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
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public void levelOrder() {

    }

    @Override
    public E getMin() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty!");
        Node node = getMin(root);
        return node.data;
    }

    /**
     * 查找以node为根节点的二分搜索树的最小值节点
     * @param node
     * @return
     */
    private Node getMin(Node node) {
        if (node.left == null)
            return node;
        return getMin(node.left);
    }

    @Override
    public E getMax() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty");
        return getMax(root).data;
    }

    /**
     * 查找以node为根节点的二分搜索树的最大值节点
     * @param node
     * @return
     */
    private Node getMax(Node node) {
        if (node.right == null)
            return node;
        return getMax(node.right);
    }

    @Override
    public E removeMin() {
        E e = getMin();
        root = removeMinNode(root);
        return e;
    }

    /**
     * 删除以root为根节点的最小值节点
     * 返回删除之后的root节点
     * @param node
     * @return
     */
    private Node removeMinNode(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMinNode(node.left);
        return node;
    }

    @Override
    public E removeMax() {
        E e = getMax();
        root = removeMaxNode(root);
        return e;
    }

    /**
     * 删除以root为根节点的最大值节点
     * 返回删除之后的root节点
     * @param node
     * @return
     */
    private Node removeMaxNode(Node node) {
        if (node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMaxNode(node.right);
        return node;
    }


    @Override
    public void remove(E e) {
        remove(root,e);
        return;
    }

    /**
     * 删除以node为根节点且值为e的节点
     * 返回删除后的二叉树节点
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node,E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.data) < 0) {
            node.left = remove(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = remove(node.right,e);
        }
        //此时Node为要删除的节点
        if (e == node.data) {
            if (node.left == null && node.right != null) {
                Node nodeRight = node.right;
                node.right = null;
                size--;
                return nodeRight;
            }
            if (node.right == null && node.left != null) {
                Node nodeLeft = node.left;
                node.left = null;
                size--;
                return nodeLeft;
            }
            if (node.left != null && node.right != null) {
                //先找到前驱结点或后继节点（后继节点）
                Node result = getMin(node.right);
                //将左子树链到后继节点上
                result.left = node.left;
                //将删除后继节点后的右子树链到后继节点上
                result.right = removeMinNode(node.right);
                size--;
                node.right = node.left = null;
                return result;
            }
        }
        return node;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        generateTreeStruct(root,0,sb);
        return sb.toString();
    }
    private void generateTreeStruct(Node node,int depth,StringBuilder res) {
        if (node == null) {
            res.append("null"+"\n");
            return;
        }
        res.append(generateGang(depth)+node.data+"\n");
        generateTreeStruct(node.left,depth+1,res);
        generateTreeStruct(node.right,depth+1,res);
        return;
    }

    /**
     * 循环输出"--"
     * @param depth
     * @return
     */
    private String generateGang(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < depth;i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}

