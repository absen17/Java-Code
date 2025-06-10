public class Method_P3 {
//    static void natural(int a){
//        int sum = 0;
//        for (int i=1;i<=a;i++){
//            sum += i;
//            System.out.println(sum);
//        }
//
//    }
    static int recSum(int x){
        if(x==1){
            return 1;
        }
        return x + recSum(x-1);
    }
    public static void main(String[] args) {
//        natural(2);
       int c = recSum(4);
       System.out.println(c);
    }
}
