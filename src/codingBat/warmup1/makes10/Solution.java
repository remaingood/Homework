package codingBat.warmup1.makes10;

/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */
public class Solution {
    public boolean makes10(int a, int b) {
        if ((a + b == 10) || a == 10 || b == 10){
            return true;
        }
        else return false;

    }

}
