import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,2,8,1,7);
      
        int result = nums.parallelStream()
                    .filter(n->n%2==1)
                    // .sorted()
                    .map(n->n*2)
                    .reduce(0,(c,e)->c+e);
                    
        System.out.println(result);
                    // Stream<Integer> sortedData = data.sorted();

        // long count =data.count();
        // System.out.println(count);
    

        // mappedData.forEach(n->System.out.println(n));
        
        // for (int integer : nums) {
        //     System.out.println(n*2);
        // }

    }
}
