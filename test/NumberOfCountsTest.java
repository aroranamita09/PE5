import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
    final Map<String, Integer> expected = new HashMap<String, Integer>();
    @Test
    public void testNumberOfCounts() throws Exception{
        NumberOfCounts obj=new NumberOfCounts();
        String str = "one one -one___two,,three,one @three*one?two" ;
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,obj.numberOfcounts(str));
    }
    @Test
    public void testNumberOfCount() throws Exception{
        NumberOfCounts obj=new NumberOfCounts();
        String stri = "one -one___two,,three,one @three*one?two" ;
        expected.put("one",4);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,obj.numberOfcounts(stri));
    }
    @Test
    public void testNumberOfConts()  throws Exception{
        NumberOfCounts obj=new NumberOfCounts();
        String strin = "one one -one___two,,,one @three*one?" ;
        expected.put("one",5);
        expected.put("two",1);
        expected.put("three",1);
        assertEquals(expected,obj.numberOfcounts(strin));
    }

}