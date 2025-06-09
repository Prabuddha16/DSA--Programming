// https://leetcode.com/problems/two-sum
// Time Complexity: O(n)
// Space Complexity: O(n)

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
