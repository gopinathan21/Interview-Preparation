package combination_sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void backtrack(
            ArrayList<List<Integer>> result,
            ArrayList<Integer> tempList,
            int[] candidates,
            int remain,
            int start) {

        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, remain - candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }

    // public void backtrack(
    //         ArrayList<List<Integer>> result,
    //         ArrayList<Integer> tempList,
    //         int[] candidates,
    //         int remain,
    //         int start) {

    //     if (remain == 0) {
    //         result.add(new ArrayList<>(tempList));
    //         return;
    //     }
    //     if (start == candidates.length || remain < 0)
    //         return;

    //     tempList.add(candidates[start]);
    //     backtrack(result, tempList, candidates, remain - candidates[start], start);
    //     tempList.remove(tempList.size() - 1);
    //     backtrack(result, tempList, candidates, remain, start + 1);
    //     return;
    // }
}
