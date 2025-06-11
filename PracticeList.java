import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3);
        Set<Integer> set = list.stream().filter(i->Collections.frequency(list,i)<2).collect(Collectors.toSet());
        System.out.println(set);
        
    }
}