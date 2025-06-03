import java.util.Scanner;

class StringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Check if there is a line to read
        if (sc.hasNextLine()) {
          
            // Taking string from user
            String s = sc.nextLine();
            
            // Using StringBuilder to store  
            // the reversed string
            StringBuilder res = new StringBuilder();

            // Traversing from the end to start
            for (int i = s.length() - 1; i >= 0; i--) {
                
                // Adding element to the StringBuilder
                res.append(s.charAt(i));
            }

            // Printing the reversed string
            System.out.println(res.toString());
        } else {
            System.out.println("No input provided.");
        }
        
        sc.close();  // Close the scanner to avoid resource leak
    }
}