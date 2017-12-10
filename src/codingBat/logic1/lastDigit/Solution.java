package codingBat.logic1.lastDigit;
/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 */
public class Solution {
    public boolean lastDigit(int a, int b, int c) {
        int aD = a % 10;
        int bD = b % 10;
        int cD = c % 10;
        if(aD == bD) {
            return true;
        }
        if(aD == cD) {
            return true;
        }
        return (bD == cD);

    }

}
