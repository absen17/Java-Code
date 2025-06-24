package Imp;
public class ThirdLargest {
    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 20, 3, 9, 25 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        System.out.println("The third largest element in the array is: " + third);
    }
}
