package codingBat.array1.rotateLeft3;
/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 */
public class Solution {
    public int[] rotateLeft3(int[] nums) {
        int [] newNums = new int[3];
        if(nums.length == 3){
            newNums[0] = nums[1];
            newNums[1] = nums[2];
            newNums[2] = nums[0];
        }
        return newNums;

    }

}
