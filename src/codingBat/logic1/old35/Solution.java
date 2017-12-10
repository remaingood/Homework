package codingBat.logic1.old35;
/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
 */
public class Solution {
    public boolean old35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;

    }

}
