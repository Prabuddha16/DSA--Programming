// https://leetcode.com/problems/two-sum
// Time Complexity: O(n)
// Space Complexity: O(n)
package Hashing;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }
            map.put(nums[i], i);
        }

        // No solution found
        return new int[] {};
    }
}
