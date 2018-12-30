import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapFunctionsTest {
    @Test
    public void testMapFunctions() throws Exception
    {
        MapFunctions obj=new MapFunctions();
        HashMap<String,String> hmap=new HashMap<String,String> ();
        hmap.put("java","c++");
        assertEquals("  +java",obj.fun(hmap));
    }

}