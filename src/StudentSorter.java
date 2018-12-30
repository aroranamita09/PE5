import java.util.Comparator;

abstract class StudentSorter implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.getAge()-s2.getAge();

    }

}
