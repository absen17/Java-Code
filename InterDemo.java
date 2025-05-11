interface ATest {

    int age = 33;
    String area="Area"; //final and static

    void show();
    void config();
}

class BTest implements ATest{
    public void show() {
        System.out.println("in show");
    }

    public void config() {

        System.out.println("in config");
    }
}

public class InterDemo {
    public static void main(String[] args) {
        ATest obj = new BTest();
        obj.show();
        obj.config();

        // ATest.age = 44; 

        System.out.println(ATest.age);
    }
}
