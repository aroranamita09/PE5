import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;
import static org.junit.Assert.*;

public class MapFunctionsTest {
    @Test
    public void testMapFunctions() throws Exception
    {
        MapFunctions obj=new MapFunctions();
        Map<String, String> hmap=new HashMap<>();
        hmap.put("val1","java");
        hmap.put("val2","c++");
       // Map<String, String> expectedMap=new HashMap<>();
       // expectedMap.put("val1", " ");
        //expectedMap.put("val2", "java");
        Map<String, String> resultingMap=obj.fun(hmap);

        assertTrue(hmap.equals(resultingMap));
    }

}
