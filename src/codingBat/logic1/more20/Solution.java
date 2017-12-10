package codingBat.logic1.more20;
/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
 */
public class Solution {
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

}
