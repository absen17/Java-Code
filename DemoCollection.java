import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        
        System.out.println(nums.get(2));

        for(int n : nums){
            System.out.println(n);
        }
    }
}
