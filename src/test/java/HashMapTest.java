import com.ainur.collections.HashMap;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HashMapTest {

    @org.junit.Test
    public void testPutRemoveIsEmpty() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "aaa");
        hashMap.put(1, "bbb");
        hashMap.put(2, "ccc");
        Assert.assertEquals(hashMap.size(), 3);
        Assert.assertEquals(hashMap.remove(0), "aaa");
        Assert.assertEquals(hashMap.remove(1), "bbb");
        Assert.assertTrue(!hashMap.isEmpty());
        Assert.assertEquals(hashMap.remove(2), "ccc");
        Assert.assertTrue(hashMap.isEmpty());
    }

    @org.junit.Test
    public void testContainsValue() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "aaa");
        hashMap.put(0,"bbb");
        hashMap.put(123, "xxxxx");

        Assert.assertFalse(hashMap.containsValue("aaa"));
        Assert.assertTrue(hashMap.containsValue("bbb"));

        Assert.assertTrue(hashMap.containsValue("xxxxx"));
        Assert.assertFalse(hashMap.containsValue("cccc"));
    }

    @org.junit.Test
    public void testContainsKey() {
            HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
            hashMap.put(0, "aaa");
            hashMap.put(2, "xxx");

            Assert.assertEquals(hashMap.get(0), "aaa");
            Assert.assertEquals(hashMap.get(2), "xxx");

    }

    @org.junit.Test
    public void testGet() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "aaa");
        hashMap.put(1, "bbb");
        hashMap.put(2, "ccc");
        Assert.assertEquals(hashMap.get(1), "bbb");
        Assert.assertEquals(hashMap.get(2), "ccc");
    }

    @org.junit.Test
    public void testSize() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "aaa");
        hashMap.put(1, "bbb");
        hashMap.put(2, "ccc");
        hashMap.remove(2);
        Assert.assertEquals(hashMap.size(), 2);
    }
}
