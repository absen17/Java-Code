import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoOfStreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(8,3, 2, 5, 4, 6);

        nums.stream()
            .filter(n->n%2!=0)
            .sorted()
            .map(n->n*2)
            .forEach(n->System.out.print(n+ " "));

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
