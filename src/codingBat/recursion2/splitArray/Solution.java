package codingBat.recursion2.splitArray;
/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
 */
public class Solution {
    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);

    }
    private boolean splitArrayHelper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return sum1 == sum2;
        }
        return splitArrayHelper(start + 1, nums, sum1 + nums[start], sum2) || splitArrayHelper(start + 1, nums, sum1, sum2 + nums[start]);
    }


}
