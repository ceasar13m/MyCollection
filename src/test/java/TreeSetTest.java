import com.ainur.collections.HashMap;
import com.ainur.collections.TreeSet;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TreeSetTest {

    @org.junit.Test
    public void testAdd() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("aaa");
        Assert.assertTrue(treeSet.size() == 1);
        treeSet.add("aaa");
        Assert.assertTrue(treeSet.size() == 1);
        treeSet.add("bbb");
        Assert.assertTrue(treeSet.size() == 2);
    }

    @org.junit.Test
    public void testSize() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("aaa");
        Assert.assertTrue(treeSet.size() == 1);
    }
}