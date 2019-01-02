import java.util.ArrayList;
import java.util.List;

public class MainTest
{
    Student s1=new Student(1,"Namita",22);
    Student s2=new Student(2,"Purnima",22);
    Student s3=new Student(3,"Archana",35);
    Student s4=new Student(4,"Mansa",21);
    Student s5=new Student(5,"Aradhya",5);
    List<Student> list=new ArrayList<Student>();

    public void setS1(Student s1) {
        this.s1 = s1;
    }

    public Student getS1() {
        return s1;
    };

}
