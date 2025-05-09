final class Calc {
    public final void show() {
        System.out.println("in Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdCal extends Calc{
    public void show(){
        System.out.println("in AdCal show");
    }
}

public class KeywrdFin {
    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.show();
        obj.add(2, 4);

    }
}
