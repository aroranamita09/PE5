public class Student {
    /**Create a Student class that represents the following information of a student: id, name, and age all
     the member variables should be private .
     a. Implement `getter and setter` .
     b. Create a `StudentSorter` class that implements `Comparator interface` .
     c. Write a class `Maintest` create Student class object(minimum 5)
     d. Add these student object into a List of type Student .
     e. Sort the list based on their age in decreasing order, for student having same
     age, sort based on their name.
     f. For students having same name and age, sort them according to their ID.**/
    private Integer id;
    private String name;
    private Integer age;
    public Student(int id, String name,
                   int age)
    {
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public Integer getAge(Integer Age)
    {
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public String getName(String name)
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer getId(Integer id)
    {
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String toString()
    {
        return this.id+ " " + this.name +
                " " + this.age;
    }
}
