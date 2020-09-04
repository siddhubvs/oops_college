package person_super;

public class person {
    String name;
    person(){        }
    person(String name)
    {
        this.name=name;
    }
    void setName(String name)
    {
        name=name;
    }
}
class student extends person
{
    int stdno;
    student(int n,String name)
    {
        super(name);
        this.stdno=n;
    }
    void setSno(int n)
    {
        stdno=n;
    }
    void display()
    {
        System.out.println("roll no:"+stdno);
        System.out.println("name :"+name);
    }
}
