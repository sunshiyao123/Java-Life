import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"诗尧","喜欢","刘苗","诗尧");
        //modeCount = 4
        Iterator<String> iterator = list.iterator();
        //取得集合迭代器（取得当前集合的副本）
        //expectedModeCount = 4
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("喜欢")) {
                //集合类提供的remove()方法
                //modeCount = 5
                list.remove("喜欢");
                continue;
            }
            System.out.println(str);
        }
    }
}
