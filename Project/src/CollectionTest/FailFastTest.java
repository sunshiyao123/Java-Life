package CollectionTest;

import java.util.*;

public class FailFastTest{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //modCount = 1
        list.add("hello");
        list.add("world");
        list.add("bit");
        //modCount = 4
        list.add("hello");
        //expectedModCount = 4(取得迭代器时赋值，为当前modCount)
        Iterator<String> iterator = list.iterator();
        //当再次调用hasNext()时检查modCount与expectedModCount是否相等，不相等抛出异常
        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("world")) {
                //modCount = 5
                list.remove("world");
            }
            System.out.println(str);
        }
    }
}
