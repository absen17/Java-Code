import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoOfStreamAPI3 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,3,2,5,4,6,7,8,9,10);
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

        //filtering
        List<Integer> evens = list.stream()
                            .collect(Collectors.filtering(n->n>5, Collectors.toList()));
        System.out.println(evens);

        //collectingAndThen
        int size = lists.stream()
                        .collect(Collectors.collectingAndThen
                        (Collectors.toSet(), n->n.size()));
        System.out.println(size);

        //mapping with downstream collector
        int sumOfChar = lists.stream()
                            .collect(Collectors.mapping(n->n.length(),
                            Collectors.summingInt(n->n.intValue())));
        System.out.println(sumOfChar);

        //toMap
        Map<String, Integer> map = lists.stream()
        .collect(Collectors.toMap(Function.identity(), n->n.length()));
        System.out.println("To Map : "+map);
    }
}
