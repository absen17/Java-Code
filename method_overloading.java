public class method_overloading {
    static void joke(){
        System.out.println("Hahhahaha \n" +
                "LOL");
    }
//    static void logic(int [] arr){
//        arr[0]=98;
//    }
    static void foo(){
        System.out.println("Hello Bro!");
    }
    static void foo(int a){
        System.out.println("Hello Bro! " + a);
    }
    static void foo(int c, int d){
        System.out.println("Hello Bro! "+ c);
        System.out.println("Hello Bro! "+ d);
    }

    public static void main(String[] args) {
////        joke();
//        int []  marks = {12,34,54,67,88};
//        logic(marks);
//        System.out.println(marks[0]);
        foo();
        foo(1000);
        foo(2000,3000);


    }
}
