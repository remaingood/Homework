package codingBat.string1.frontAgain;

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
 */

public class Solution {
    public boolean frontAgain(String str)
    {
        int len = str.length();
        if(len >= 2) {
            return str.substring(0, 2).equals(str.substring(len - 2, len));
        }
        else return false;
    }
}
