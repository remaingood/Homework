package codingBat.string1.hasBad;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 */
public class Solution {
    public boolean hasBad(String str)
    {
        int len = str.length();
        if(len == 3 && str.equals("bad"))
            return true;
        else if(len >= 4)
        {
            if(str.substring(0, 3).equals("bad"))
                return true;
            return str.substring(1, 4).equals("bad");
        }
        else
            return false;
    }
}
