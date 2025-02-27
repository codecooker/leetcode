package cn.codecooker.leetcode.q15;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution solution = new Solution();
        System.out.println(solution.threeSum(nums));
    }
}
