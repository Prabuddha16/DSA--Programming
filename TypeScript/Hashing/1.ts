// https://leetcode.com/problems/two-sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

function twoSumArray(nums: number[], target: number): number[] {
    const map = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
        const remaining = target - nums[i];

        if (map.has(remaining)) {
            return [map.get(remaining)!, i];
        }

        map.set(nums[i], i);
    }

    return [];
}

// Time Complexity: O(n)
// Space Complexity: O(n)
