package codingBat.warmup1.startHi;

/*
Given a string, return true if the string starts with "hi" and false otherwise.
 */

public class Solution {
    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        else {
            String start = str.substring(0, 2);
            return start.equals("hi");
        }
    }
}
