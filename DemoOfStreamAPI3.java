import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoOfStreamAPI3 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,3,2,5,4,6);
        List<String> lists = Arrays.asList("apple","banana","cherry");

        //partitioningBy
        Map<Boolean,List<Integer>> result = list.stream()
                    .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result);

        //counting
        long res = list.stream().collect(Collectors.counting());
        System.out.println(res);

        //summarizingInt
        IntSummaryStatistics stats = list.stream()
            .collect(Collectors.summarizingInt(n-> n.intValue()));
        System.out.println(stats);

        //mapping
        List<Integer> length = lists.stream()
        .collect(Collectors.mapping(n->n.length(), Collectors.toList()));
        System.out.println(length);

    }
}
