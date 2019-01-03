import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest
{
    public void addStudentList()
    {


    Student s1=new Student(1,"Namita",22);
    Student s2=new Student(2,"Purnima",22);
    Student s3=new Student(3,"Archana",35);
    Student s4=new Student(4,"Mansa",21);
    Student s5=new Student(5,"Aradhya",5);
    List<Student> list=new ArrayList<Student>();


    list.add(s1);
    list.add(s2);
    list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);

        Collections.sort(list, new StudentComparator() {
            @Override
            public int compare(Student s1, Student s2) {
                return super.compare(s1, s2);
            }
        });
        for(Student std:list)
            System.out.println(std);

    }}
