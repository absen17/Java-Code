package Imp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,1,2,67,3,4,5,5);
        // List<Integer> list1 =  list.stream().sorted(Collections.reverseOrder())
        int a =  list.stream().sorted(Collections.reverseOrder())
                            .distinct()
                            .limit(2)
                            // .findFirst()
                            // .collect(Collectors.toList());
                            .skip(1)
                            .findFirst()
                            .get();
        // System.out.println(list1);
        System.out.println(a);
    }
}
