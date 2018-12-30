import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateListTest {
    @Test
    public void testUpdatedList() throws Exception
    {
        List<String> inputList=new ArrayList<>() ;
        inputList.add("Apple");
        inputList.add("Grape");
        inputList.add("Melon");
        inputList.add("Berry");
        UpdateList obj=new UpdateList();
        assertEquals("Kiwi Grape Mango Berry",obj.fruitName( inputList));
       // assertEquals("this is true",,obj.fruitname());
    }
    /**public void testAgainUpdatedList() throws Exception
    {
        UpdateList obj=new UpdateList();
        assertEquals("this is true","[Mango,Grape, Berry,Apple]",obj.update("[Apple, Grape, Melon, Berry]"));
    }
    public void testSecondUpdatedList() throws Exception
    {
        UpdateList obj=new UpdateList();
        assertEquals("this is true","[Orange, Banana, Cherry, Lemon]",obj.update("[Apple, Grape, Melon, Berry]"));
    }**/

}