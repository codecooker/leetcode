package cn.codecooker.leetcode.q27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (val == nums[i]) {
                // 从i + 1全部前移，最后一个元素修改成val
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length -= 1;
                nums[length] = val;
                i--;
            }
        }


        return length;
    }
}
