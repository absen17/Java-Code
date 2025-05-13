class Abs{
    public void show() throws ClassNotFoundException{
       
            Class.forName("DemoOfThrosssss");
       
    }
}

public class DemoOfThros {

    static{
        System.out.println("Class loaded...");
    }
    public static void main(String[] args) {
        Abs obj = new Abs();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
