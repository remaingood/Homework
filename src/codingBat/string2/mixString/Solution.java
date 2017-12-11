package codingBat.string2.mixString;
/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 */
public class Solution {
    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int maxLength = 0;
        if (a.length()>b.length()){
            maxLength = a.length();
        }
        else maxLength = b.length();
        for (int i = 0; i < maxLength; i++){
            if (i<a.length()) sb.append(a.substring(i,i+1));
            if (i<b.length()) sb.append(b.substring(i,i+1));
        }
        return sb.toString();

    }

}
