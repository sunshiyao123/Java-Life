package CollectionTest.ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListTest{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(3));
        System.out.println(list.get(2));
        System.out.println(list.set(2,6));
        System.out.println(list);

        //删除指定索引
        list.remove(2);
        //删除指定对象
        list.remove(new Integer(6));

        System.out.println(list);
        System.out.println();

    }
}
