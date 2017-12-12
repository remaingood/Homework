package codingBat.array2.post4;
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Solution {
    public int[] post4(int[] nums) {
        int post = nums.length - 1;
        int[] array;
        while(nums[post] != 4) {
            post--;
        }
        array = new int[nums.length - 1 - post];
        for(int i = post + 1; i < nums.length; i++) {
            array[i - post - 1] = nums[i];
        }
        return array;

    }

}
