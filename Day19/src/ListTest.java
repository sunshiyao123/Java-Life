import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.size()+"、"+list.isEmpty());
//        //0,true
//        list.add("诗尧");
//        list.add("喜欢");
//        list.add("喜欢");
//        list.add("刘苗");
//        System.out.println(list.size()+"、"+list.isEmpty());
//        //4,false
//        System.out.println(list);
//        System.out.println(list.remove("喜欢"));
//        System.out.println(list.contains("诗尧"));
//        //true
//        System.out.println(list.contains("非常"));
//        //false
//        System.out.println(list);

//        List<String> list = new ArrayList<>();
//        list.add("诗尧");
//        list.add("喜欢");
//        list.add("刘苗");
//        System.out.println(list.get(1));
//        list.set(2,"刘小攻");
//        System.out.println(list);


        Collection<String> collection = new ArrayList<>();
        collection.add("诗尧");
        collection.add("喜欢");
        collection.add("刘苗");
        //操作以Object为主，有可能需要向下转型，就有可能产生异常
        Object[] result = collection.toArray();
        for (Object o : result) {
            System.out.println(o);
        }
    }
}
