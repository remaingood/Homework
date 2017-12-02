package codingBat.array1.sum3;

/*
Given an array of ints length 3, return the sum of all the elements.
 */

public class Solution {
    public int sum3(int[] nums) {
        int res = 0;
        if(nums.length == 3){
            res = nums[0] + nums[1] + nums[2];
        }
        return res;

    }

}
