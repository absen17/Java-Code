package Imp;
import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r= ch + r;
        }
        System.out.println(r);
    }
}
