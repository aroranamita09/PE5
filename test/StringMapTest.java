import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class StringMapTest {
    @Test
    public void testFun() throws Exception
    {
        StringMap obj=new StringMap();
        String  arr[] = {"a","b" ,"c","d","a","c","c"};
        Map<String ,Boolean> expected=null;
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertSame(expected,obj.fun(arr));
    }

}