import java.util.Scanner;

public class Average_Arguments {
    static float avg(float ...arr){
        float total = 0;
        for (float scan:arr){
            total += scan;
        }
        float avrg = total/arr.length;
        return avrg;
    }
    public static void main(String[] args) {
        float result = avg(4,4,4,4,9);
        System.out.println(avg(result));
    }
}
