package cn.codecooker.leetcode.q26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int preNumber = nums[0];

        // 第一次遍历先把重复的元素标记为最小值
        for (int i = 1; i < nums.length; i++) {
            if (preNumber == nums[i]) {
                nums[i] = Integer.MIN_VALUE;
            } else {
                preNumber = nums[i];
            }
        }

        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Integer.MIN_VALUE < nums[i]) {
                nums[length++] = nums[i];
            }
        }

        return length;
    }

}
