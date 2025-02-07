import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        
        System.out.print("Initial list: " + list);
        
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
          
            String temp = iterator.next();
            System.out.println(temp);
            
            if ("Blue".equals(temp)) {
                iterator.remove();
            }
        }

        System.out.println("Modified list: " + list);
    }
}
