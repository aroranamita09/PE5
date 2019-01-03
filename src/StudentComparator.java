import java.util.Comparator;

abstract class StudentComparator implements Comparator<Student> {
    public int  compare(Student s1,Student s2){
        if( s1.getAge().equals(s2.getAge()))
        {
            if(s1.getName().equals(s2.getName()))
            {
                if(s1.getId().equals(s2.getId()))
                    return 1;
            }
        }
      else return 0;
    }

}
