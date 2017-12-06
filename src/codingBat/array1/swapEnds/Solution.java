package codingBat.array1.swapEnds;

/*
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
 */

public class Solution {
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        if (nums.length >= 1){
            nums[0] = nums[nums.length -1];
            nums[nums.length -1] = temp;
        }

        return nums;

    }

}
