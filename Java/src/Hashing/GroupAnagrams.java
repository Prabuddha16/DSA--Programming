package Hashing;
import java.util.*;

// https://leetcode.com/problems/group-anagrams

public class GroupAnagrams {
    // Sorting
    // Time Complexity: O(n * m log m)
    // n = number of strings
    // k = max length of a string (because of sorting)
    // Space Complexity: O(n * k) — storing grouped strings in the map
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
