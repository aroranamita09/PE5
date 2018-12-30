import java.util.HashMap;
import java.util.Map;
public class StringMap {
    /**Write a program where an array of strings is input and output is a Map< String ,boolean> where
     each different string is a key and its value is true if that string appears 2 or more times in the array
     Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
     Output - {“a” : true,”b” :false ,”c” :true,”d” : false} **/
    public Map<String,Boolean> fun(String [] str)
    {
        Map<String,Boolean> hmap=new HashMap<>();
        Map<String,Integer> charCount=new HashMap<String,Integer>();
        for(String  c:str)
        {
           if(charCount.get(c)>0)
           {
              charCount.put(c,charCount.get(c)+1);}
              else {charCount.put(c,1);}
        }
       // if(charCount.containsValue("2")||charCount.containsValue("3"))
        for(Map.Entry<String,Integer> entry:charCount.entrySet())
        {
            if(entry.getValue()>=2){
                hmap.put(entry.getKey(),true);
            }
            else
                hmap.put(entry.getKey(),false);
        }
        return hmap;}
    }






