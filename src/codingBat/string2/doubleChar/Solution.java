package codingBat.string2.doubleChar;
/*
Given a string, return a string where for every char in the original, there are two chars.
 */
public class Solution {
    public String doubleChar(String str) {
        int length = str.length();
        char ch;
        StringBuilder stringBuilder = new StringBuilder(length*2);
        for(int i = 0; i < length; i++){
            ch = str.charAt(i);
            stringBuilder.append(ch);
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();

    }

}
