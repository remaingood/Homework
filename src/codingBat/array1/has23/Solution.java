package codingBat.array1.has23;

/*
Given an int array length 2, return true if it contains a 2 or a 3.
 */

public class Solution {
    public boolean has23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3) {
            return true;
        }
        return (nums[1] == 2 || nums[1] == 3);

    }
}
