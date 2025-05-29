import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparator2 {
    public static void main(String[] args) {

        Comparator<String> com = (a,b)
                            ->a.length()>b.length()?1:-1;
        
        List<String> name = new ArrayList<>();

        name.add("Abhishek");
        name.add("Sen");
        name.add("Pujan");
        name.add("Ab");

        Collections.sort(name,com);

        for(String n : name){
            System.out.print(n + " ");
        }
        

    }
}
