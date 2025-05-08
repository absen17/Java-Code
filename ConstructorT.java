class Human{
    private int age;
    private String name;

    public Human(){
        name = "Ram";
        age = 12;
        System.out.println("in Constructor");
    }

    public Human(int a, String n){
        age=a;
        name=n;
    }
    
    

    public Human(String name) {
        this.age=90;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
public class ConstructorT {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human("Mam");
        Human obj1 = new Human(43,"Sam");
        System.out.println(obj.getAge()+ " : " + obj.getName());
        System.out.println(obj1.getAge()+ " : " + obj1.getName());
        System.out.println(obj2.getName()+obj2.getAge());
        // obj.setAge(10);
        // obj.setName("Sen");

        // System.out.println(obj.getAge()+ " : " + obj.getName());
    
    }
}
