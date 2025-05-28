import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studentss {

    String name;
    int age;

    public Studentss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Studentss [name=" + name + ", age=" + age + "]";
    }

}

public class DemoComparator {
    public static void main(String[] args) {

        Comparator<Studentss> com = (a, b)-> a.age>b.age?1:-1;

        List<Studentss> students = new ArrayList<>();

        students.add(new Studentss("Abhishek", 31));
        students.add(new Studentss("Sen", 45));
        students.add(new Studentss("Pujan", 63));
        students.add(new Studentss("Sonu", 41));

        Collections.sort(students,com);

        for(Studentss s : students){
            System.out.println(s);
        }



        //================================
        // Comparator<Integer> com = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // else
        // return -1;
        // }
        // }
        // List<Integer> nums = new ArrayList<>();
        // nums.add(47);
        // nums.add(23);
        // nums.add(34);
        // nums.add(71);
        // Collections.sort(nums,com);
        // System.out.println(nums);

    }
}
