import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        
        Map<String, Integer> student = new HashMap<>();

        student.put("Ab", 301);
        student.put("Sen", 100);
        student.put("Abhi", 201);
        student.put("Ab", 301);
        student.put("Ab", 305);
        student.put("Ab", 301);
        student.put("DD", null);

        System.out.println(student);

        System.out.println(student.keySet());

        for(String key : student.keySet()){
            System.out.println(key+ " : " + student.get(key));
        }



    }
}
