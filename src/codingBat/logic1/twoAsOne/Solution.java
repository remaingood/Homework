package codingBat.logic1.twoAsOne;
/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 */
public class Solution {
    public boolean twoAsOne(int a, int b, int c) {
        return (a + b) == c || (b + c) == a || (c + a) == b;

    }

}
