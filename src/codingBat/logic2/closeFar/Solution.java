package codingBat.logic2.closeFar;
/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
 */
public class Solution {
    public boolean closeFar(int a, int b, int c) {
       return  Math.abs(b-a) <= 1 && Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2 || Math.abs(c-a) <= 1 && Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2;

    }

}
