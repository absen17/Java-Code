import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();
        map.put("AA", 12);
        map.put("BB", 14);
        map.put("FF", 20);

       Set<Map.Entry<String,Integer>> newMap = map.entrySet();
       for(Map.Entry<String,Integer> p : newMap){
        System.out.println(p.getKey() +" : "+ p.getValue());
       }
    }
}
