package codingBat.string1.right2;
/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
 */
public class Solution {
    public String right2(String str) {
        String res = "";
        if(str.length() >= 2){
            String last2 = str.substring(str.length()-2, str.length());
            res = last2 + str.substring(0, str.length()-2);
        }

        return res;

    }

}
