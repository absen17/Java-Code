public class Method_P4 {
    static void pattern(int a){
        for (int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
//public static void main(String[] args)
//{
//    int rows=7;
////inner loop
//    for (int i= rows-1; i>=0 ; i--)
//    {
////outer loop
//        for (int j=0; j<=i; j++)
//        {
////prints star and space
//            System.out.print("*" + " ");
//        }
////throws the cursor in the next line after printing each line
//        System.out.println();
//    }
//}
}
