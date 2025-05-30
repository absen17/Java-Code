import java.util.Arrays;
import java.util.List;

public class DemoOfStreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,8,3, 2, 5, 4, 6);

        int result = nums.stream()
            .filter(n->n%2!=0)
            .sorted()
            .map(n->n*2)
            .reduce(0,(a,b)->a+b);
        System.out.println(result);

        // long data = nums.stream().count();
        // System.out.println(stream);
        

        // Stream<Integer> result = nums.stream()
        //                            .filter(n->n%2==0)
        //                            .sorted();
                    // .map(n -> n*2)
                    // .reduce(0,(c,e)->c+e);

        // result.forEach(n->System.out.println(n));
       
    }
}
