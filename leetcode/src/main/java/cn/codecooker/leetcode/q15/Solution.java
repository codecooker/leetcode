package cn.codecooker.leetcode.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();

        Map<NumberIndex, Integer> subResult = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int index = i + 1; index < nums.length; index++) {
                NumberIndex numberIndex = new NumberIndex(i, index);
                if (!subResult.containsKey(numberIndex)) {
                    subResult.put(numberIndex, nums[i] + nums[index]);
                }
            }
        }

        subResult.forEach((key, value) -> {
            for (int i = 0; i < nums.length; i++) {
                if (key.first != i && key.second != i && value + nums[i] == 0) {
                    System.out.println(nums[key.first] + "," + nums[key.second] + "," + nums[i]);
                    resList.add(Arrays.asList(nums[key.first], nums[key.second], nums[i]));
                }
            }
        });

        return resList;
    }

    public class NumberIndex {
        public int first;
        public int second;

        NumberIndex(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NumberIndex) {
                boolean result = this.first == ((NumberIndex) obj).first && this.second == ((NumberIndex) obj).second;
                return result || this.second == ((NumberIndex) obj).first && this.first == ((NumberIndex) obj).second;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return first + second;
        }
    }
}
