import java.util.HashMap;

class Day1_TwoSum {
    // Problem: Two Sum
    // Link: https://leetcode.com/problems/two-sum/
    // Time: O(n) | Space: O(n)
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}