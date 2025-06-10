public class CelToFar {
    static float conv(float a){
//        formula(n*9/5)+32
       float Far = (a*9/5)+32;
        System.out.println(Far);
        return Far;
    }
    public static void main(String[] args) {
        conv(-1);
    }
}
