package power_set;

import java.util.*;

public class Solution {
    public List<List<Integer>> generatePowerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result, 0);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result, int depth) {
        // Indentation for clarity
        String indent = "  ".repeat(depth);

        // Print entering this call
        System.out.println(indent + "Enter: " + current + ", start=" + start);

        // Add a copy of current subset to result
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // Choose
            current.add(nums[i]);
            System.out.println(indent + "  Choose " + nums[i] + " -> " + current);

            // Explore
            backtrack(nums, i + 1, current, result, depth + 1);

            // Un-choose
            current.remove(current.size() - 1);
            System.out.println(indent + "  Backtrack -> " + current);
        }

        // Print leaving this call
        System.out.println(indent + "Exit: " + current + ", start=" + start);
    }
}
