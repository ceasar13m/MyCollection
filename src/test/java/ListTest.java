import com.ainur.collections.ArrayList;
import com.ainur.collections.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.Map;
import java.util.Set;



@RunWith(JUnit4.class)
public class ListTest {

    @org.junit.Test
    public void test0(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");

        Assert.assertTrue(list.contains("aaa"));
    }

    @org.junit.Test
    public void test1(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");

        Assert.assertFalse(list.contains("bnb"));
    }


    @org.junit.Test
    public void test2(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.remove("bbb");

        Assert.assertFalse(list.contains("bbb"));
    }

    @org.junit.Test
    public void test3(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.remove("bbb");

        Assert.assertTrue(list.contains("bbb"));
    }
}


