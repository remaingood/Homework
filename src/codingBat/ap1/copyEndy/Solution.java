package codingBat.ap1.copyEndy;
/*

We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.


 */
public class Solution {
    public int[] copyEndy(int[] nums, int count) {
        int[] array = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(isEndy(nums[i])) {
                array[index] = nums[i];
                index++;
            }
        }

        return array;

    }

    boolean isEndy(int n) {
        return 0 <= n && n <= 10 || 90 <= n && n <= 100;
    }

}


