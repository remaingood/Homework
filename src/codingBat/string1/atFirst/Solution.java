package codingBat.string1.atFirst;
/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
 */
public class Solution {
    public String atFirst(String str) {
        int len = str.length();
        if(len >= 2) {
            return str.substring(0, 2);
        }
        else if(len == 1) {
            return (str.charAt(0) + "@");
        }
        else return "@@";
    }

}
