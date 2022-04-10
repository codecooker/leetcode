package cn.codecooker.leetcode.q118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
               subList.add(1);
            }

            if (result.size() > 0) {
                List<Integer> preList = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                   subList.add(j, preList.get(j - 1) + preList.get(j));
                   subList.remove(j + 1);
                }
            }

            result.add(subList);
      }

      return result;
    }            
}
