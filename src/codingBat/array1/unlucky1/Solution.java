package codingBat.array1.unlucky1;
/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 */

public class Solution {
    public boolean unlucky1(int[] nums) {
        int last = nums.length-1;
        if(last  >= 2){
            if((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)) {
                return true;
            }
            return (nums[last-1] == 1 && nums[last] == 3);
        }
        if(last  == 1) {
            return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3));
        }
        return false;
    }

}
