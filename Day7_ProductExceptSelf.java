class Day7_ProductExceptSelf {
    // Problem: Product of Array Except Self
    // Link: https://leetcode.com/problems/product-of-array-except-self/
    // Time: O(n) | Space: O(1) extra
    
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i-1] * nums[i-1];
        }
        
        int suffix = 1;
        for (int i = n-1; i >= 0; i--) {
            output[i] = suffix * output[i];
            suffix = suffix * nums[i];
        }
        
        return output;
    }
}