package codingBat.string1.conCat;
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 */
public class Solution {
    public String conCat(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len1 >= 1 && len2 >= 1)
        {
            if(a.charAt(len1-1) == b.charAt(0)) {
                return (a + b.substring(1));
            }
            else return (a + b);
        }
        return (a + b);

    }

}
