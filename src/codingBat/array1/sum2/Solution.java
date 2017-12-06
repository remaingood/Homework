package codingBat.array1.sum2;

/*
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 */
public class Solution {
    public int sum2(int[] nums) {
        int sum = 0;
        if(nums.length == 0){
            return 0;
        }
        else if (nums.length == 1){
            sum = nums[0];
        }
        else if(nums.length >= 2){
            sum = nums[0] + nums[1];
        }

        return sum;

    }

}
