import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoOfStrm {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog", "Cat");
        Set<String> newList = list.stream()
                                .filter(i -> Collections.frequency(list, i) > 1)
                                .collect(Collectors.toSet());
        System.out.println(newList);                        
    }
}