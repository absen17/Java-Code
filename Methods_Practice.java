import java.util.Scanner;

public class Methods_Practice {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",i,n,i*n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your choice : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        multiplication(a);

    }
}
