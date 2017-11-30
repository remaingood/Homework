package codingBat.warmup2.noTriples;

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 */
public class Solution {
    public boolean noTriples(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int number = nums[i];
            if (nums[i+1]== number && nums[i+2]== number) {
                return false;
            }
        }

        return true;

    }

}
