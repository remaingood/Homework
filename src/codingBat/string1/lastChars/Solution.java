package codingBat.string1.lastChars;
/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 */

public class Solution {
    public String lastChars(String a, String b) {
        int len = b.length();
        String res = "";
        res += (a.length() >= 1) ? a.charAt(0) : '@';
        res += (len >= 1) ? b.charAt(len-1) : '@';
        return res;

    }

}
