class Parent {
    {
        draw(5);
    }
    static{
        System.out.println("In static");
    }
    
    void draw(int a){
        System.out.println("Parent" + a);
    }
}

class Child extends Parent{
    void draw(int a){
        System.out.println("Child" + a);
    }
}

public class PraticeOOPS {
    public static void main(String[] args) {
        Parent p = new Child();
        p.draw(10);
    }
}
