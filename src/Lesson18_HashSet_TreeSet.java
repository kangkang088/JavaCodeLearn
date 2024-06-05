import java.util.HashSet;
import java.util.TreeSet;

public class Lesson18_HashSet_TreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.remove(0);
    }
}
