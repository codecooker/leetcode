package cn.codecooker.leetcode.q9;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        int num = 123;
        Solution solution = new Solution();
        Assert.assertEquals(false,solution.isPalindrome(num));
    }

    @Test
    public void test02() {
        int num = -123;
        Solution solution = new Solution();
        Assert.assertEquals(false,solution.isPalindrome(num));
    }

    @Test
    public void test03() {
        int num = 121;
        Solution solution = new Solution();
        Assert.assertEquals(true,solution.isPalindrome(num));
    }

    @Test
    public void test04() {
        int num = 1;
        Solution solution = new Solution();
        Assert.assertEquals(true,solution.isPalindrome(num));
    }

    @Test
    public void test05() {
        int num = 999999;
        Solution solution = new Solution();
        Assert.assertEquals(true, solution.isPalindrome(num));
    }
} 