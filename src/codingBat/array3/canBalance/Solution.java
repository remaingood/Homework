package codingBat.array3.canBalance;
/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 */
public class Solution {
    public boolean canBalance(int[] nums) {
        int left = 0;
        int right = nums[nums.length-1];
        for(int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
        }
        for(int i = nums.length - 2; i > 0; i--){
            if(left == right) {
                return true;
            }
            left -= nums[i];
            right += nums[i];
        }
        return left == right;

    }

}
