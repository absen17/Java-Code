public class Fibonaccci {
    static int fib(int a){
        if (a==1 || a==2){
            return a-1;
        }
        else {
            return fib(a-1) + fib(a-2);
        }
    }
    public static void main(String[] args) {
//      fib = 0 1 1 2 3 5 8 13 21 ...
        int result = fib(4);
        System.out.println(result);
    }
}
