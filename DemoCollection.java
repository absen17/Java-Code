import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollection {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();

        // Set<Integer> nums = new HashSet<>();

        // Set<Integer> nums = new TreeSet<>();

        // Set<Integer> nums = new LinkedHashSet<>();

        nums.add(41);
        nums.add(22);
        nums.add(72);
        nums.add(10);
        nums.add(60);
        nums.add(91);

        // for(int n : nums){
        //     System.out.println(n);
        // }

        // Iterator<Integer> values1 = nums.iterator();
        // while (values1.hasNext()) {
        //     System.out.print(values1.next());
        //     System.out.print(" ");
        // }

        ListIterator<Integer> values2 = nums.listIterator();
        while (values2.hasNext()) {
            System.out.print(values2.next());
            System.out.print(" ");
        }
        System.out.println(" ");
        while (values2.hasPrevious()) {
            System.out.print(values2.previous());
            System.out.print(" ");
        }
        
        


        // System.out.println(nums.get(2)); //only for list

        
    }
}
