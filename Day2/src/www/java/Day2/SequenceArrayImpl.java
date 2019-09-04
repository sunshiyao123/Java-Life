package www.java.Day2;

import java.util.Arrays;
public class SequenceArrayImpl implements Sequence {
    private static final int DEFAULT_CAPACITY = 10;  //
    private int size;  //定义数组长度
    private Object[] elementData;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    public SequenceArrayImpl() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    @Override
    //修改元素
    public Object set(int index, Object newData) {
        rangCheck(index);
        Object oldData = elementData[index];
        elementData[index] = newData;
        return oldData;
    }
    //得到元素下标
    @Override
    public Object get(int index) {
        rangCheck(index);
        return elementData[index];
    }
    //判断是否有这个元素
    @Override
    public boolean contains(Object data) {
        if(data == null) {
            for(int i = 0; i < size; i++) {
                if(elementData[i] == null) {
                    return true;
                }
            }
        } else {
            for(int i = 0; i < size; i++) {
                if(elementData[i].equals(data)) {
                    return true;
                }
            }
        }
        return false;
    }
    //返回当前数组长度
    @Override
    public int size() {
        return this.size;
    }
    //将元素转变为数组
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData,size);
    }
    //清空数组
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        this.size = 0;
    }
    //添加元素
    @Override
    public void add(Object data) {
        ensureCapacity(size+1);
        elementData[size++] = data;
    }
    //移除元素
    @Override
    public Object remove(int index) {
        rangCheck(index);
        Object oldData = elementData[index];
        int moveSize = size - index -1;
        if(moveSize > 0) {
            System.arraycopy(elementData, index+1, elementData, index, moveSize);
        }
        elementData[--size] = null;
        return oldData;
    }
    //判断当前数组长度是否够
    private void ensureCapacity(int minCap) {
        if (minCap - elementData.length > 0) {
            grow(minCap);
        }
    }
    private void grow(int minCap) {
        int oldCap = elementData.length;
        int newCap = oldCap << 1;
        if (newCap - minCap < 0) {
            newCap = minCap;
        }
        if (newCap - MAX_ARRAY_SIZE > 0) {
            throw new ArrayIndexOutOfBoundsException("超过数组最大阈值");
        }
        elementData = Arrays.copyOf(elementData,newCap);
    }
    private void rangCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("下标不存在");
        }
    }
}
