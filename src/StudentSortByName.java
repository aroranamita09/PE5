import java.util.Comparator;


class StudentSortByName implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(Student a, Student b)
    {
        return a.getName().compareTo(b.getName());
    }
}
