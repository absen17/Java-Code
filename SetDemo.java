import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("B");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            if(iterator.next()=="B"){
                set.remove(iterator.next());
                System.out.println(iterator.next());
            }
        }
    }
}
