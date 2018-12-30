import java.util.*;

public class SetInterface {
    /**Write a program to implement set interface which sorts the given randomly ordered names in
            ascending order. Convert the sorted set in to an array list
    Input : Harry Olive Alice Bluto Eugene
    Output :
    Sorted Set : Alice Bluto Eugene Harry Olive
    Array list from Set : Alice Bluto Eugene Harry Olive**/
    public List setInterface(Set names)
    {
        Set<String> tree_Set = new TreeSet<String>(names);
        System.out.println(tree_Set);
        List list = new ArrayList(names);
        list.add(tree_Set);
        return list;
    }
}
    public Set<String> sortedSet(Set<String> set) {
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        Collections.sort(list);
        System.out.print("Sorted set is: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList from set: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Set<String> newSet=new LinkedHashSet<String>(list);
        return newSet;
    }
