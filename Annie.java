import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Annie {
    public static void main(String[] args) {
        Map<String,String> map1= new LinkedHashMap<>();
//        Map<String,String> map1= new HashMap<>();
//        map1.put("1001","Chandler");
        map1.put("1002","Annie");
        map1.put("1010","Joey");
        map1.put("1001","Sen");
        map1.put("1003","AB");
//        map1.put("1002","A");
//        map1.remove(1010);
//        map1.remove("1001");
//        map1.remove(2);
        System.out.println(map1);
    }
}
