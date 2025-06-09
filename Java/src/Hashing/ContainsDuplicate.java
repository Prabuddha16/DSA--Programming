package Hashing;
import java.util.HashSet;
import java.util.Set;
// https://leetcode.com/problems/contains-duplicate

// Using Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)
public class ContainsDuplicate {
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

}

// Using Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)
/*
 public class ContainsDuplicate {
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
*/