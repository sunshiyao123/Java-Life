package Heap;

import javax.xml.soap.Node;

//public class Heap<E> {
//    private int size;
//    private E[] elements;
//    private static int maxSize = 10;
//    public Heap() {
//        new Heap(maxSize,null);
//    }
//
//    public Heap(int size) {
//        new Heap(size,null);
//    }
//
//    public Heap(int size,Comparable<E> comparable) {
//        elements = new E[size];
//        com
//    }
//
//    private void add(E e) {
//        if (size == maxSize) {
//            kuo();
//        }
//        siftUp(e);
//    }
//    private void kuo() {
//        if (size == maxSize) {
//            size = size *2;
//        }
//    }
//
//    private void siftUp(int index) {
//        while (index > 0 && compare(elements[index],elements[getParent(index)])) {
//            swap(index,getParent(index));
//        }
//    }
//    private void siftDown(int index) {
//
//    }
//    private void swap(int indexA,int indexB) {
//        E temp = elements[indexA];
//        elements[indexA] = elements[indexB];
//        elements[indexB] = temp;
//    }
//
//
//    private Node remove(Node node,E e) {
//        if (node == null) {
//
//        }
//    }
//    /**
//     * 替换当前根节点值
//     * @param newValues
//     * @return
//     */
//    private E replace(E newValues) {
//        E result = getMax();
//        elements[0] = newValues;
//        siftDown(0);
//        return result;
//    }
//
//    public Heap(E[] arr) {
//        elements = (E[]) new Object[arr.length];
//
//    }
//    private E getMax(){return elements[0];}
//    private int getLeftSize(int index) {
//        return index*2+1;
//    }
//    private int getRightSize(int index) {
//        return index*2+2;
//    }
//    private int getParent(int index) {
//        return (index-1)/2;
//    }

//}
