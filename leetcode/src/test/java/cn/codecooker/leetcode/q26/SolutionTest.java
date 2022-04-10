package cn.codecooker.leetcode.q26;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        Solution solution = new Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = solution.removeDuplicates(nums);
        System.out.println(length);
        System.out.println(nums);
    }

    @Test
    public void test02() {
        Solution solution = new Solution();

        int[] nums = {0,0,0};
        int length = solution.removeDuplicates(nums);
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
    }
}
