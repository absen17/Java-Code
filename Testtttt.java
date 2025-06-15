public class Testtttt {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.get();
    }

    abstract class Demo {
        public int a;

        void demo() {
            a = 10;
        }

        abstract final public void get();
    }

    class Test extends Demo {
        final public void get() {
            System.out.println();
        }


}
