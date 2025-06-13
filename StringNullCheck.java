// Java Program to check if
// a String is Null
class StringNull {

    // Method to check if the String is Null
    public static boolean isStringNull(String s)
    {

        // Compare the string with null
        // using == relational operator
        // and return the result
        if (s == null)
            return true;
        else
            return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Test strings
        String s1 = "GeeksforGeeks";
        String s2 = null;
        System.out.println("Is string [" + s1
                           + "] null? "
                           + isStringNull(s1));
        System.out.println("Is string [" + s2
                           + "] null? "
                           + isStringNull(s2));
    }
}
