package codingBat.array1.makeEnds;

/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
 */

public class Solution {
    public int[] makeEnds(int[] nums) {
        int[] newNums = new int[2];
        if(nums.length >= 1){
            newNums[0] = nums[0];
            newNums[1] = nums[nums.length - 1];
        }

        return newNums;

    }
}
