import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        //HashSet
        Set<String> set = new HashSet<>();
        set.add("诗尧");
        set.add("刘苗");
        set.add("诗尧");
        set.add(null);
        System.out.println(set);
    }
}
