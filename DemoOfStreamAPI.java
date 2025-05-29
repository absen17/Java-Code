import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoOfStreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(8,3, 2, 5, 4, 6);

         Stream<Integer> result = nums.stream()
                                   .filter(n->n%2==0)
                                   .sorted();
                    // .map(n -> n*2)
                    // .reduce(0,(c,e)->c+e);

        result.forEach(n->System.out.println(n));
       
    }
}
