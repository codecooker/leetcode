package cn.codecooker.leetcode.q35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int endIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                endIndex = i;
                break;
            }
        }
        return endIndex;
    }
}