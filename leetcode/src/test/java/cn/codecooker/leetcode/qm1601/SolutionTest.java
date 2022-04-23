package cn.codecooker.leetcode.qm1601;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] result = solution.swapNumbers(new int[]{1,3});
        System.out.println(Arrays.toString(result));
    }

   @Test
   public void test02() {
       Solution solution = new Solution();
       int[] result = solution.swapNumbers(new int[]{-2147483647,214748364});
       System.out.println(Arrays.toString(result));
   } 
}
