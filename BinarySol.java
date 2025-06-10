public class BinarySol {
    public static int getMinFlips(String pwd) {
        int n = pwd.length();
        int minFlips = 0;

        // Iterate over the string to create even-length substrings
        for (int i = 0; i < n; i += 2) {
            // Get two characters at a time (since we want even-length substrings)
            if (i + 1 < n) {
                char first = pwd.charAt(i);
                char second = pwd.charAt(i + 1);
                // If the two characters are different, we need to flip one
                if (first != second) {
                    minFlips++;
                }
            }
        }
        return minFlips;
    }
    public static void main(String[] args) {
        String pwd = "101011";  // Example given in the problem
        System.out.println("Minimum flips required: " + getMinFlips(pwd));
    }
}
