package cn.codecooker.leetcode.q2182;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        Solution solution = new Solution();
        System.out.println(solution.repeatLimitedString("cczazcc", 3));
    }

    @Test
    public void test02() {
        Solution solution = new Solution();
        System.out.println(solution.repeatLimitedString("aababab", 2));
    }

    @Test
    public void test03() {
        Solution solution = new Solution();
        System.out.println(solution.repeatLimitedString("aaa", 2));
    } 

    @Test
    public void test04() {
        Solution solution = new Solution();
        System.out.println(solution.repeatLimitedString("", 2));
    } 
}
