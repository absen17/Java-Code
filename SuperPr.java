class Person {
    public void message()
    {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    public void message()
    {
        System.out.println("This is student class");
    }
    
    // Note that display() is
    // only in Student class
    public void display()
    {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}
public class SuperPr {
    public static void main(String args[])
    {
        Student s = new Student();

        // calling display() of Student
        s.display();
    }
    
}