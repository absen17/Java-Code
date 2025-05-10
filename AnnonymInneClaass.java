abstract class A {
    public abstract void show();
}

public class AnnonymInneClaass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in show...");
            }
        };
        obj.show();
    }
}
