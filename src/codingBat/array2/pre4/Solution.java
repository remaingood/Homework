package codingBat.array2.pre4;
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Solution {
    public int[] pre4(int[] nums) {
        int pre = 0;
        int[] array;
        while(nums[pre] != 4) {
            pre++;
        }
        array = new int[pre];
        for(int i = 0; i < pre; i++) {
            array[i] = nums[i];
        }
        return array;
    }

}
