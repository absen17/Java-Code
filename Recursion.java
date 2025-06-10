import java.util.Scanner;

public class Recursion {
    static int fact(int n){
        if (n==0 || n ==1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
    static int fact_iterative(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        else {
            int b = 1;
            for (int i = 1; i <= x; i++) {
                b *= i;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Choice : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(fact_iterative(a));
        System.out.println(fact(a));
    }
}
