public class Calling_methods {
    static int logic(int x,int y){
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5 ;
        int b = 7 ;
        int c;
        Calling_methods obj= new Calling_methods();
        c= obj.logic(a,b);
        int a1 = 3 ;
        int b1 = 2 ;
        int c1;
        Calling_methods obj1= new Calling_methods();
        c1=obj1.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }

}
