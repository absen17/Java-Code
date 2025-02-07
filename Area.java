public class Area {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println("Area is : "+c.area());
     

        Circle c1 = Shape.createCircle(10);
        System.out.println("Area of Circle is : "+c1.area());

        // Rectangle r = new Rectangle(10, 20);
        // System.out.println("Area of Rec : " + r.area());

        Rectangle r1 = Shape.createRectangle(10, 20);
        System.out.println("Area of Rec : " + r1.area());
    }
}
