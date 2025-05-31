import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoOfStreamAPI2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,44,33,33,4,1,4);
        Set<Integer> collect = list.stream()
                                .filter(i->Collections.frequency(list, i)>1)
                                .collect(Collectors.toSet());
        System.out.println(collect);
        
    }   
}
