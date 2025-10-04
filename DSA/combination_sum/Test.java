package combination_sum;

import java.util.*;

public class Test {
    public static void runTests() {
        Solution sol = new Solution();

        // Test 1
        int[] candidates1 = {2, 3, 5, 4};
        int target1 = 7;
        List<List<Integer>> result1 = sol.combinationSum(candidates1, target1);

        List<List<Integer>> expected1 = Arrays.asList(
            Arrays.asList(2, 2, 3),
            Arrays.asList(3, 4),
            Arrays.asList(5, 2)
        );

        assert compareLists(result1, expected1) : "Test 1 failed";

        // Test 2
        int[] candidates2 = {2};
        int target2 = 1;
        List<List<Integer>> result2 = sol.combinationSum(candidates2, target2);

        List<List<Integer>> expected2 = new ArrayList<>(); // empty
        assert compareLists(result2, expected2) : "Test 2 failed";

        // Test 3 (extra)
        int[] candidates3 = {2, 3, 6, 7};
        int target3 = 7;
        List<List<Integer>> result3 = sol.combinationSum(candidates3, target3);

        List<List<Integer>> expected3 = Arrays.asList(
            Arrays.asList(7),
            Arrays.asList(2, 2, 3)
        );
        assert compareLists(result3, expected3) : "Test 3 failed";

        System.out.println("All combination-sum tests passed.");
    }

    // Utility method to compare lists of lists (ignores order of combinations)
    private static boolean compareLists(List<List<Integer>> a, List<List<Integer>> b) {
        if (a.size() != b.size()) return false;

        // sort inner lists
        List<List<Integer>> sortedA = new ArrayList<>();
        for (List<Integer> l : a) {
            List<Integer> copy = new ArrayList<>(l);
            Collections.sort(copy);
            sortedA.add(copy);
        }
        List<List<Integer>> sortedB = new ArrayList<>();
        for (List<Integer> l : b) {
            List<Integer> copy = new ArrayList<>(l);
            Collections.sort(copy);
            sortedB.add(copy);
        }

        // sort outer list
        sortedA.sort(Comparator.comparing(Object::toString));
        sortedB.sort(Comparator.comparing(Object::toString));

        return sortedA.equals(sortedB);
    }

    public static void main(String[] args) {
        runTests();
    }
}
