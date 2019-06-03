package BinaryTree;

import BinaryTree.Impl.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(5);
        binarySearchTree.add(1);
        binarySearchTree.add(8);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(7);
        System.out.println(binarySearchTree.getMax());
        System.out.println(binarySearchTree.removeMax());
        System.out.println(binarySearchTree.getMax());
    }
}
