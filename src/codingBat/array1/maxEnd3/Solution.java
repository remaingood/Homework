package codingBat.array1.maxEnd3;

/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
 */

public class Solution {
    public int[] maxEnd3(int[] nums) {
        int[] newNums = new int[3];
        int max = nums[0];
        if(nums[nums.length-1] > max){
            max = nums[nums.length-1];
        }

        for (int i = 0; i < newNums.length; i++){
            newNums[i] = max;
        }

        return newNums;

    }
}
