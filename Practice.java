public class Practice {

    public int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        try {
        Practice obj = new Practice();
        System.out.println(obj.getSum(2,3));// compilation error
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}