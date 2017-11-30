package codingBat.warmup1.in1020;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 */
public class Solution {
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

}
