import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoTryWithResources {
    public static void main(String[] args) throws IOException  {
        
        int num = 0;
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        // {
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
            System.out.println(num);
        }
}
}
