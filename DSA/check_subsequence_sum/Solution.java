package check_subsequence_sum;

public class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return s(nums, 0, k, 0);
    }
    public boolean s(int[] nums, int sum, int k, int i) {
        if (sum == k) return true;
        if (i == nums.length) return false;
        return s(nums, sum, k, i + 1) || s(nums, sum + nums[i], k, i + 1);
    }
}
