import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStreamAPI {
    public static void main(String[] args) {
        
        //filter
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result = num.stream().filter(n->n>5)
                    .collect(Collectors.toList());
        System.out.println(result);

        //map
        List<String> name = Arrays.asList("apple", "banana", "cherry");
        List<String> res = name.stream()
                                .map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(res);

        //flatmap
        List<List<String>> listOfLists = Arrays.asList
                                        (Arrays.asList("one","two"),
                                        Arrays.asList("three", "four"));
        List<String> r = listOfLists.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println("Flatmap : "+ r);

        //distinct
        List<Integer> num1 = Arrays.asList(1,2,2,3,3,4);
        List<Integer> distinct = num1.stream()
                                .distinct().collect(Collectors.toList());
        System.out.println(distinct);

        //sorted
        List<String> name1 = Arrays.asList("apple", "banana", "cherry","pine");
        List<String> sort = name1.stream()
                                 .sorted(Comparator.reverseOrder())
                                 .collect(Collectors.toList());
        System.out.println(sort);

        //peek
        List<String> name2 = Arrays.asList("apple", "banana", "cherry","pine");
        List<String> peek = name2.stream()
                                 .peek(n->System.out.println("Original : "+n))
                                 .map(n->n.toUpperCase())
                                 .collect(Collectors.toList());
        System.out.println("Peek : "+peek);

        //limit
        List<Integer> num3 = Arrays.asList(1,2,2,3,3,4);
        List<Integer> limit = num3.stream()
                                .limit(3)
                                .collect(Collectors.toList());
        System.out.println("limit : "+limit);

        //skip
        List<Integer> num4 = Arrays.asList(1,2,2,3,3,4);
        List<Integer> skip = num4.stream()
                                .skip(3)
                                .collect(Collectors.toList());
        System.out.println(skip);

        //for-each
        List<Integer> num5 = Arrays.asList(1,2,2,3,3,4);
        num5.stream()
            .forEach(n->System.out.print(n));

        //
        System.out.println();

        //collect
        List<Integer> num6 = Arrays.asList(11,22,25,33,35,41);
        Set<Integer> collect = num6.stream()
                                   .collect(Collectors.toSet());
        System.out.println(collect);

        //reduce
        List<Integer> num7 = Arrays.asList(11,22,25,33,35,41);
        int result1 = num7.stream().reduce(0,(a,b)->a+b);
        System.out.println(result1);

        //allmatch /nonematch /anymatch
        List<Integer> list = Arrays.asList(1,12,4,5,1);
        boolean re = list.stream().noneMatch(n->n>10);
        System.out.println(re);

        //findfirst / findany
        List<String> name8 = Arrays.asList("appple","apple", "banana", "cherry","pine");
        Optional<String> findFirst = name8.stream()
                                        .filter(n->n.startsWith("a"))
                                        .findAny();
        System.out.println(findFirst);

        //max min
        Optional<Integer> r1 = list.stream().min((a,b)->a.compareTo(b));
        System.out.println(r1);

        // to Array
        String[] arr = name8.stream().toArray(n->new String[n]);
        for(String a: arr){
            System.out.print(a + " ");
        }

        System.out.println();

        //joining
        String joiningResult = name8.stream()
                .collect(Collectors.joining(" ","{",")"));
        System.out.println(joiningResult);

        //grouping By
        List<String> grp = Arrays.asList("apple","banana","cherry","date");
        Map<Integer,Long> grpLength = grp.stream()
            .collect(Collectors.groupingBy(n->n.length(),Collectors.counting()));
        System.out.println(grpLength);

    }
}
