package codingBat.string1.withoutEnd;

/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 */
public class Solution {
    public String withoutEnd(String str) {
        String res = "";
        if(str.length() >= 2){
            res = str.substring(1, str.length()-1);
        }
        return res;

    }

}
