public class ArrayReverse {
    public static void main(String[] args) {
        String arr [] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        reverseArray(arr);
    }
    
    public static void reverseArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
