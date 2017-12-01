package codingBat.string1.extraEnd;
/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
 */
public class Solution {
    public String extraEnd(String str) {
        int len = str.length();
        String temp = str.substring(len-2, len);
        return (temp + temp + temp);

    }

}
