package codingBat.string1.minCat;
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 */

public class Solution {
    public String minCat(String a, String b)
    {
        int lenA = a.length();
        int lenB = b.length();
        if(lenA >= lenB) {
            return (a.substring(lenA - lenB) + b);
        }
        else return (a + b.substring(lenB-lenA));
    }
}
