abstract class Car{

    public abstract void drive();

    public void playing(){
        System.out.println("Music playing..");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    } 
}

public class AbstDemo {

     public static void main(String[] args) {
        Car car = new WagonR();
        car.drive();
        car.playing();
     }
}