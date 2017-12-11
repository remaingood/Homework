package codingBat.array2.no14;
/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public class Solution {
    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int n : nums) {
            if (n == 1) {
                has1 = true;
            }
            else if (n == 4) {
                has4 = true;
            }
        }

        return !has1 || !has4;

    }
}
