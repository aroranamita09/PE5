import java.util.Comparator;

abstract class StudentSorter implements Comparator<Student>{
    public int  compare(Student s1,Student s2){
        if( s1.getAge()==(s2.getAge()))
        {
            if(s1.getName().equals(s2.getName()))
            {
                return s1.getId().compareTo(s2.getId());
            }else return s1.getName().compareTo(s2.getName());
        }
      else return s1.getAge().compareTo(s2.getAge());
    }
}
