public class JavaCache {
    public static void main(String[] args) {

        Integer one = Integer.valueOf(100);
        Integer two = Integer.valueOf(100);
        System.out.println(one == two); // true

        Integer three = Integer.valueOf(300);
        Integer four = Integer.valueOf(300);
        System.out.println(three == four);// false
        System.out.println(three.equals(four)); 
    }
}
