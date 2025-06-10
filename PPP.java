import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class PPP {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            Integer num = iterator.previous();
            System.out.println(num+" ");
        }
    }
}
