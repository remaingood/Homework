package codingBat.string1.middleTwo;
/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
 */

public class Solution {
    public String middleTwo(String str) {
        String res = "";
        if(str.length() >=2 ){
            res =  str.substring(str.length()/2 -1, str.length()/2 + 1);
        }
        return res;

    }



}
