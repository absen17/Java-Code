public class DemoOfWrapperClass {
    public static void main(String[] args) {
        
        int num = 1; //primitive value
        Integer num1 = new Integer(num); // boxing - primitive value into a wrapper class
        Integer num2 = num; // auto-boxing
        int num3 = num1.intValue(); // auto-unboxing
        System.out.println(num3);

        String str = "56";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}
