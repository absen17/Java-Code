import java.util.Arrays;
import java.util.List;

public class P3 {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Dhoni","Kohli","Rohit");
        String res = str.stream().filter(n->n.equalsIgnoreCase("Gill")).findAny().get();
        System.out.println(res);
    }
}