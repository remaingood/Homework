package codingBat.string2.zipZap;
/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 */
public class Solution {
    public String zipZap(String str) {
        return str.replaceAll("z.p", "zp");

    }
}
