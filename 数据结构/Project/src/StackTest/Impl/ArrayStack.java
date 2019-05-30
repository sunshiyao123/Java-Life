package StackTest.Impl;

import StackTest.Stack;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * 顺序栈，基于数组实现
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {
    //最多存放的元素个数
    private int maxSize;
    //存放数据
    private Object[] elementData;
    //当前栈中的元素个数
    private int currentSize = 0;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        elementData = new Object[maxSize];
    }

    @Override
    public boolean push(T t) {
        if (currentSize == maxSize) {
            int newSize = maxSize<<1;
            //判断是否栈长度过大
            if (newSize + 8 > Integer.MAX_VALUE) {
                System.out.println("栈过大");
                return false;
            }
            maxSize = newSize;
            elementData = Arrays.copyOf(elementData,maxSize);
        }
        //先放然后将currentSize++
        elementData[currentSize++] = t;
        return true;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("当前栈为空");
            return null;
        }
        //返回的是currentSize--为下标的元素，并且删除最后一个元素
        return (T) elementData[--currentSize];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("当前栈为空");
            return null;
        }
        //返回的是currentSize-1为下标的元素
        return (T) elementData[currentSize-1];
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize==0;
    }
}
