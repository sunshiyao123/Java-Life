import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"诗尧");
        map.put(2,"刘苗");
        //key重复,则为更新内容
        map.put(1,"喜欢");
        map.put(null, null);
        map.put(null, null);
        map.put(4,null);
        //取得当前Map中的所有key值
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------");
        for (Integer i : keySet) {
            System.out.println(map.get(i));
        }

    }
}
