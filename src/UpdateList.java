import java.util.ArrayList;
import java.util.List;

public class UpdateList {
    /**
     * Write a Java program to update specific array element by given element and empty the array list .
     * Input: [Apple, Grape, Melon, Berry]
     * Output: [Kiwi, Grape, Mango, Berry]
     */
    public static String fruitName(List inputList)
    {
        /**inputList.add("Apple");
        inputList.add("Grape");
        inputList.add("Melon");
        inputList.add("Berry");**/

        inputList.set(0,"Kiwi");
        inputList.set(2,"Mango");
        String str="";
        for(int i=0;i<inputList.size();i++)
        str+=" "+inputList.get(i);
        return str.trim();
    }
}
