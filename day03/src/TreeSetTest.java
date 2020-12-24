import java.util.TreeSet;

/**
 *
 * 存储结构：红黑树
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();

        t1.add("xyz");
        t1.add("abc");
        t1.add("ojbk");

        System.out.println(t1.size());
        System.out.println(t1.toString());


    }
}
