@FunctionalInterface
interface Ab{
    int add(int i, int j);
}

public class DemoFunInterF {
    public static void main(String[] args) {
        Ab obj = (i,j)-> i+j;
        int result = obj.add(5,7);
        System.out.println(result);
    }
}
