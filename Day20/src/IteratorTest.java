import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("诗尧");
//        list.add("喜欢");
//        list.add("刘苗");
//        ListIterator<String> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        System.out.println("-------------");
//        //反向输出，并且必须要有正向输出
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }

        Vector<String> vector = new Vector<>();
        vector.add("诗尧");
        vector.add("喜欢");
        vector.add("刘苗");
        for (String str : vector) {
            System.out.println(str);
        }
    }
}
