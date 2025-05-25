class T{
    public void show(){
        for(int i =1;i<=10;i++){
            System.out.println("Hi");
        }
    }
}
class T1{
    public void show(){
        for(int i =1;i<=10;i++){
            System.out.println("Hello");
        }
    }
}
public class DemoOfThread {
    public static void main(String[] args) {
        T obj1 = new T();
        T1 obj2 = new T1();

        obj1.show();
        obj2.show();
    }
}
