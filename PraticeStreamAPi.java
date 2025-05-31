import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PraticeStreamAPi {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Long> map = str.chars()
                            .mapToObj(c->(char) c)
                            .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                            ));
        Optional<Map.Entry<Character,Long>> res =map.entrySet().stream().filter(key->key.getValue()==1).findFirst();

        System.out.println(map);
        System.out.println(res);
        
    }
}