package codingBat.array1.sameFirstLast;
/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 */
public class Solution {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length >= 1){
            if(nums[0] == nums[nums.length -1]){
                return true;
            }
        }
        return false;
    }

}
