package count_subsequence_sum;

public class Solution {
    public int countSubsequenceSum(int[] nums, int k) {
        return s(nums, 0, k, 0);
    }

    public int s(int[] nums, int sum, int k, int i) {
        if (sum == k) {
            return 1;
        }
        if (i == nums.length) return 0;
        int left = s(nums, sum, k, i + 1);
        int right = s(nums, sum + nums[i], k, i + 1); 
        return left + right;   
    }
}
