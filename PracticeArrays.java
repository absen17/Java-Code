import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            // if (set1.contains(num)) 
                intersectionSet.add(num);
            
        }
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Intersection of [1, 2, 2, 1] and [2, 2]: " + Arrays.toString(sol.intersection(nums1, nums2))); // [2]
    }
}