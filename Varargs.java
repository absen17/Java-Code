public class Varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b,int c){
//        return a+b+c;
//    }
    static int sum(int x,int ...arr){
        int result=x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The Sum of 3 and 4 is = "+ sum(3,4));
        System.out.println("The Sum of 3 = "+ sum(3));
        System.out.println("The Sum of 1, 2 , 3 and 4 is = "+ sum(1,2,3,4));


    }
}
