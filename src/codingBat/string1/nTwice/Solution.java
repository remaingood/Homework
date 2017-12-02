package codingBat.string1.nTwice;

/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
 */

public class Solution {
    public String nTwice(String str, int n) {
        String res = "";
        if(str.length() >= n){
            res = str.substring(0, n) + str.substring(str.length()-n, str.length());
        }
        return res;

    }

}
