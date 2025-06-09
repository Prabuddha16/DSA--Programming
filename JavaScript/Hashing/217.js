// https://leetcode.com/problems/contains-duplicate/

// Using Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)
function containsDuplicate(nums) {
  nums.sort((a, b) => a - b);
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] === nums[i - 1]) {
      return true;
    }
  }

  return false;
}

// Using Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)
function containsDuplicates(nums) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (map.has(nums[i])) {
      return true;
    }
    map.set(nums[i], i);
  }

  return false;
}
