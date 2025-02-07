public interface Shape {

    double area();

    // default void print(){
    //     System.out.println("This is a shape");
    // };

    static Circle createCircle(double radius){
        return new Circle(radius);
    }

    static Rectangle createRectangle(double length, double breadth){
        return new Rectangle(length, breadth);
    }

}
