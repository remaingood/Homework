package codingBat.warmup1.mixStart;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */

public class Solution {
    public boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1, 3).equals("ix")) {
            return true;
        }

        return false;
    }
}
