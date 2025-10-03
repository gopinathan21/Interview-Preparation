package check_subsequence_sum;

public class Test {
    public static void runTests() {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5};
        int k1 = 8;
        boolean result1 = sol.checkSubsequenceSum(nums1, k1);
        assert result1 : "Test 1 failed";

        int[] nums2 = {4, 3, 9, 2};
        int k2 = 10;
        boolean result2 = sol.checkSubsequenceSum(nums2, k2);
        assert !result2 : "Test 2 failed";

        System.out.println("All check-subsequence-sum tests passed.");
    }

    public static void main(String[] args) {
        runTests();
    }
}
