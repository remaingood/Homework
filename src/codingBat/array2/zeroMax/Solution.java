package codingBat.array2.zeroMax;
/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
 */
public class Solution {
    public int[] zeroMax(int[] nums) {
        int max;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 0){
                max = 0;
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] > max && nums[j] % 2 == 1) {
                        max = nums[j];
                    }
                }
                if(max != 0) {
                    nums[i] = max;
                }
            }
        }
        return nums;

    }
}
