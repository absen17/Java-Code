class A extends Object{
    public A(){
        System.out.println("in A");
    }
    public A(int n){

        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        this(1);
        System.out.println("in B");
    }
    public B(int n){
        this(2,5);
        System.out.println("in B int");
    }
    public B(int n,int m){
        super(1);
        System.out.println("in B double int");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(2);
    }
}
