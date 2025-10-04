package power_set;

import java.util.*;

public class Test {
    public static void runTests() {
        Solution sol = new Solution();

        // Test 1
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> result1 = sol.generatePowerSet(nums1);
        List<List<Integer>> expected1 = Arrays.asList(
            Arrays.asList(),
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(3),
            Arrays.asList(1, 2),
            Arrays.asList(1, 3),
            Arrays.asList(2, 3),
            Arrays.asList(1, 2, 3)
        );
        assert compareLists(result1, expected1) : "Test 1 failed";

        // Test 2
        int[] nums2 = {0};
        List<List<Integer>> result2 = sol.generatePowerSet(nums2);
        List<List<Integer>> expected2 = Arrays.asList(
            Arrays.asList(),
            Arrays.asList(0)
        );
        assert compareLists(result2, expected2) : "Test 2 failed";

        // Test 3
        int[] nums3 = {};
        List<List<Integer>> result3 = sol.generatePowerSet(nums3);
        List<List<Integer>> expected3 = Arrays.asList(
            Arrays.asList()
        );
        assert compareLists(result3, expected3) : "Test 3 failed";

        System.out.println("All power set tests passed.");
    }

    // Helper method to compare lists of lists ignoring order
    private static boolean compareLists(List<List<Integer>> a, List<List<Integer>> b) {
        if (a.size() != b.size()) return false;

        List<String> sortedA = new ArrayList<>();
        for (List<Integer> l : a) {
            List<Integer> copy = new ArrayList<>(l);
            Collections.sort(copy);
            sortedA.add(copy.toString());
        }

        List<String> sortedB = new ArrayList<>();
        for (List<Integer> l : b) {
            List<Integer> copy = new ArrayList<>(l);
            Collections.sort(copy);
            sortedB.add(copy.toString());
        }

        Collections.sort(sortedA);
        Collections.sort(sortedB);

        return sortedA.equals(sortedB);
    }

    public static void main(String[] args) {
        runTests();
    }
}
