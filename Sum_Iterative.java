public class Sum_Iterative {
    static int sum(int a){
        if (a==1){
            return 1;
        }
        else {
            int sum1=0;
            for (int i=1;i<=a;i++){
                sum1 += i;
            }
            return sum1;
        }

    }
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }
}
