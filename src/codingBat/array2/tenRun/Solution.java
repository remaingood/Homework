package codingBat.array2.tenRun;
/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 */
public class Solution {
    public int[] tenRun(int[] nums) {
        int multiple = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0) {
                multiple = nums[i];
            }
            else if(multiple != -1) {
                nums[i] = multiple;
            }
        }
        return nums;

    }

}
