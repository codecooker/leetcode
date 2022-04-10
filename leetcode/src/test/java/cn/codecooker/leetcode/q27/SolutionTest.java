package cn.codecooker.leetcode.q27;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRemoveElement() {
        Solution solution = new Solution();

        int[] input = {3,2,2,3};
        int length = solution.removeElement(input, 3);

        System.out.println("length = " + length + " elems = " + Arrays.toString(input));
    }

    @Test
    public void testRemoveElement02() {
        Solution solution = new Solution();

        int[] input = {0,1,2,2,3,0,4,23,2,2,3};
        int length = solution.removeElement(input, 2);

        System.out.println("length = " + length + " elems = " + Arrays.toString(input));
    }
}
