class MyException extends RuntimeException {
    public MyException(String string) {
        super(string);
    }
}

public class DemoOfThroww {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new MyException("I don't want to print zero");
        } catch (MyException e) {
            j = 18 / 1;
            System.out.println("That's the default o/p : " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);

        System.out.println("bye");
    }
}
