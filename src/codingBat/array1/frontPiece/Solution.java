package codingBat.array1.frontPiece;

/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 */

public class Solution {
    public int[] frontPiece(int[] nums) {
        int[] front;
        if(nums.length >= 2){
            front = new int[2];
            front[0] = nums[0];
            front[1] = nums[1];
        }
        else if(nums.length == 1){
            front = new int[1];
            front[0] = nums[0];
        }
        else {
            front = new int[0];
        }
        return front;

    }
}
