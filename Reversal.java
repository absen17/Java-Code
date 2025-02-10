import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        System.out.print("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        
        int rev =0;
        while (num>0) {
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);
    }
}

