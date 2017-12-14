package codingBat.recursion1.noX;
/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.
 */
public class Solution {
    public String noX(String str) {
        if(str.length() == 0) {
            return str;
        }
        char c = str.charAt(0);
        if(c == 'x') {
            return noX(str.substring(1));
        }
        return c + noX(str.substring(1));

    }
}
