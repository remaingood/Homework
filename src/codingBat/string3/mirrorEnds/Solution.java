package codingBat.string3.mirrorEnds;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
 */
public class Solution {
    public String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length()-1-i))
                result += string.charAt(i);
            else
                return result;
        }
        return result;


    }

}
