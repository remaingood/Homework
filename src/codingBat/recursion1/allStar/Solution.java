package codingBat.recursion1.allStar;
/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 */
public class Solution {
    public String allStar(String str) {
        if(str.length() < 2) {
            return str;
        }
        return str.charAt(0) + "*" + allStar(str.substring(1));

    }

}
