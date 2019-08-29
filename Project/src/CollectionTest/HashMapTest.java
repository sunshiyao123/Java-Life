package CollectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < 12;i++) {
            map.put(i,i);
        }
        //此时应该size为12，threshold为 16 * 0.75 = 12
        System.out.println(map);
    }
}
