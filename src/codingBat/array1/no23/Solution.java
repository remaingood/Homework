package codingBat.array1.no23;

/*
Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class Solution {
    public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3) {
            return false;
        }
        return !(nums[1] == 2 || nums[1] == 3);

    }

}
