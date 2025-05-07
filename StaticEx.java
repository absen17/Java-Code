class Mobile {

    String brand; // instance variable
    int price;
    static String name; // static variable

    public Mobile(){
        brand="";
        price=200;
        System.out.println("In constructor mehtod");
    }

    

    public void show(){
        System.out.println(brand + " : "+ price + " : "+name);
    }

    public static void show1(/*Mobile obj*/){
        System.out.println("In static method");
        // System.out.println(obj.brand + " : "+ obj.price + " : "+name);
    }
    static{
        System.out.println("In static block 2");
    }
    static{
        name = "Phone";
        System.out.println("In Static Block");
    }    
}
public class StaticEx {

    static void test(){
            System.out.println("Static Test Method inside main class");
    }
    public static void main(String[] args) {
        
        // Class.forName("Mobile");
        

        Mobile obj1= new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2= new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile.name="Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(/*obj1*/);

        test();
        
    }
}
