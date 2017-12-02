package codingBat.string1.endsLy;
/*
Given a string, return true if it ends in "ly".
 */

public class Solution {
    public boolean endsLy(String str) {
        if(str.length() >=2) {
            String ly = str.substring(str.length() - 2, str.length());
            if (ly.equals("ly")) {
                return true;
            }
        }

        return false;

    }

}
