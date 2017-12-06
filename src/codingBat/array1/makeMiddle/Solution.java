package codingBat.array1.makeMiddle;

/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
 */
public class Solution {
    public int[] makeMiddle(int[] nums) {
        int[] midArray = new int[2];
        int half = nums.length/2;
        midArray[0] = nums[half-1];
        midArray[1] = nums[half];
        return midArray;
    }

}
