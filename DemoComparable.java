import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studentsss implements Comparable<Studentsss> {
    String name;
    int age;

    public Studentsss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Studentsss [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Studentsss that) {

        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class DemoComparable {
    public static void main(String[] args) {

        List<Studentsss> students = new ArrayList<>();

        students.add(new Studentsss("Roso", 10));
        students.add(new Studentsss("Abhishek", 31));
        students.add(new Studentsss("Sen", 45));
        students.add(new Studentsss("Pujan", 63));
        students.add(new Studentsss("Sonu", 41));

        Collections.sort(students);

        for (Studentsss s : students) {
            System.out.println(s);
        }

    }
}
