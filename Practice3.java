import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        int sc= scanner.nextInt();
        switch (sc) {
            case 1 -> System.out.println("Hi");
            case 2->  System.out.println("Hello");
            case 3->  System.out.println("Hola");
            default-> System.out.println("Bye");    
        }
    }
}
