package codingBat.array1.midThree;
/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public class Solution {
    public int[] midThree(int[] nums) {
        int mid = nums.length/2;
        int[] newArray = new int[3];
        if(nums.length >= 3){
            newArray[0] = nums[mid -1];
            newArray[1] = nums[mid];
            newArray[2] = nums[mid+1];
        }
        return newArray;

    }

}
