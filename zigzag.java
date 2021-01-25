class Solution {
    public int movesToMakeZigzag(int[] nums) {
        // odd is the ans of odd index's value is smaller than neighbors
        // even is the ans of even index's value is smaller than neighbors
        int odd = 0, even = 0;
        int left = 0, right = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            left = i == 0 ? Integer.MAX_VALUE : nums[i - 1];
            right = i == n - 1 ? Integer.MAX_VALUE : nums[i + 1];
            if (i % 2 == 0) {
                even += Math.max(0, nums[i] - Math.min(left, right) + 1);
            } else {
                odd += Math.max(0, nums[i] - Math.min(left, right) + 1);
            }
        }
        return Math.min(odd, even);
    }
}