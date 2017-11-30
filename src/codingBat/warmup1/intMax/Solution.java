package codingBat.warmup1.intMax;

/*
Given three int values, a b c, return the largest.
 */
public class Solution {
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b){
            max = a;
        }
        else max = b;

        return max > c ? max : c;
    }
}
