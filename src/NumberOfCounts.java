import java.util.HashMap;
import java.util.HashMap;

public class NumberOfCounts {
    /**Write a program to find the number of counts in the following String . Store the output in
     Map< String ,Integer> as key value pair.
     Input : String str = “one one -one___two,,three,one @three*one?two”;
     Output : {"one":5 , "two":2, "three" :2}**/
    public HashMap<String ,Integer> numberOfcounts(String s){
    String []str=s.split(" |,");
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        int countone=0;
        int countTwo=0;
        int countThree=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains("one"))
                countone++;
            if(str[i].contains("two"))
                countTwo++;
            if(str[i].contains("three"))
                countThree++;
        }
        hmap.put("one",countone);
        hmap.put("two",countTwo);
        hmap.put("three",countThree);
        System.out.println(hmap);
        //hmap.containsKey();
        //hmap.remove;
        return hmap;
    }
}
