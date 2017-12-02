package codingBat.array1.reverse3;
/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */
public class Solution {
    public int[] reverse3(int[] nums) {
        int[] newNums = new int[3];
        if(nums.length == 3){
            newNums[0] = nums[2];
            newNums[1] = nums[1];
            newNums[2] = nums[0];
        }
        return newNums;
    }

}
