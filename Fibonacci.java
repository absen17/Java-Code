public class Fibonacci {
    public static void main(String[] args) {
        int a =0, b =1,c;
        for(int i =1;i<=5;i++){ //1 2 3 4 5 6
            System.out.println(a+" ");// 0 1 1 2 3
            c=a+b;//1 2 3 5 8
            a=b;//1 1 2 3 5
            b=c;//1 2 3 5 8
        }
        System.out.println("LOOP END");
    }
}

