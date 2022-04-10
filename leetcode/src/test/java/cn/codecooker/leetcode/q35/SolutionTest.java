package cn.codecooker.leetcode.q35;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.searchInsert(nums,5));
    }

    @Test
    public void test02() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.searchInsert(nums,2));
    }


    @Test
    public void test03() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.searchInsert(nums,7));
    }

    @Test
    public void test04() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.searchInsert(nums,0));
    }

    @Test
    public void test05() {
        int[] nums = {1};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.searchInsert(nums,0));
    }

    @Test
    public void test06() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.searchInsert(nums,-1));
    }

    @Test
    public void test07() {
        int[] nums = {1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.searchInsert(nums,999));
    }
}
