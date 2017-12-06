package codingBat.string1.extraFront;
/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
 */
public class Solution {
    public String extraFront(String str){
        String temp;
        if(str.length() >= 3) {
            temp = str.substring(0, 2);
        }
        else temp = str;
        return temp + temp + temp;
    }
}