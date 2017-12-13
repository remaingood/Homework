package codingBat.recursion1.countHi;
/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 */
public class Solution {
    public int countHi(String str) {
        if(str.length() < 2) {
            return 0;
        }
        if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));

    }

}
