class A {
    public static final char[] area = null;
    public static char[] a1;

    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
    public void show2() {
        System.out.println("in B show1");
    }
}


public class PolmP {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.show2();
    }
}
