package codingBat.array2.twoTwo;
/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 */
public class Solution {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length;){
            int count = 0;
            while(i < nums.length && nums[i++] == 2){
                count++;
            }
            if(count == 1){
                return false;
            }
        }
        return true;

    }

}
