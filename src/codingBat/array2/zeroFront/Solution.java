package codingBat.array2.zeroFront;
/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */
public class Solution {
    public int[] zeroFront(int[] nums) {
        int zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = nums[zero];
                nums[zero] = 0;
                zero++;
            }
        }
        return nums;

    }

}
