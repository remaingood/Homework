package codingBat.ap1.copyEvens;
/*

Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
 */
public class Solution {
    public int[] copyEvens(int[] nums, int count) {
        int[] array = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(nums[i] % 2 == 0) {
                array[index] = nums[i];
                index++;
            }
        }

        return array;

    }

}
