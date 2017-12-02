package codingBat.string1.middleThree;
/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
*/

public class Solution {
    public String middleThree(String str)
    {
        int len = str.length()/2;
        return str.substring(len-1,len+2);
    }
}
