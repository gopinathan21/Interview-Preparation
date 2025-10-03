package count_subsequence_sum;

public class Test {
    public static void runTests() {
        try {
            Solution sol = new Solution();
            int[] nums1 = {4, 9, 2, 5, 1};
            int k1 = 10;
            int result1 = sol.countSubsequenceSum(nums1, k1);
            assert result1 == 2 : "Test 1 failed";

            int[] nums2 = {4, 2, 10, 5, 1, 3};
            int k2 = 5;
            int result2 = sol.countSubsequenceSum(nums2, k2);
            assert result2 == 3 : "Test 2 failed";

            System.out.println("All count-subsequence-sum tests passed.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}
