import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetInterfaceTest {
    @Test
    public void testsetInterface() throws Exception {
        SetInterface obj=new SetInterface();
        Set<String> name=new HashSet<String>();
        name.add("Harry");
        name.add("Olive");
        name.add("Alice");
        name.add("Bluto");
        name.add("Eugene");
        List<String> expected=new ArrayList<String>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,obj.setInterface(name));
    }
}