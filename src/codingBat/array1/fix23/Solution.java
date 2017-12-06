package codingBat.array1.fix23;

/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 */

public class Solution {
    public int[] fix23(int[] nums) {
        int[] fixedxArray = {nums[0], nums[1], nums[2]};
        if(nums[0] == 2 && nums[1] == 3)
            fixedxArray[1] = 0;
        if(nums[1] == 2 && nums[2] == 3)
            fixedxArray[2] = 0;
        return fixedxArray;
    }
}
