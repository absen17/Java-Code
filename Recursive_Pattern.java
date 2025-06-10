public class Recursive_Pattern {
    static void patt(int a){

       if(a>0){
           patt(a-1);
           for (int i=0;i<a;i++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    static void patt2(int x){
        if (x>0){
            for (int b=x;b>0;b--){
                System.out.print("*");
            }
            System.out.println();
            patt2(x-1);
        }
    }
    public static void main(String[] args) {
         patt(4);
         patt2(4);

    }
}
