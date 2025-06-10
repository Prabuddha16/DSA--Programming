package Hashing;
import java.util.*;
// https://leetcode.com/problems/contains-duplicate

public class ContainsDuplicate {
    // Using Hashing
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Using Sorting
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public class ContainsDuplicateUsingSorting {
        public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
            return false;
        }
    }

}
