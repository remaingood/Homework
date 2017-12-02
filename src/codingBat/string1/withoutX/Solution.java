package codingBat.string1.withoutX;
/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 */
public class Solution {
    public String withoutX(String str){
        int len = str.length();
        if(len >= 2)
        {
            char c = str.charAt(0);
            StringBuilder sb = new StringBuilder(len);
            if(c != 'x') {
                sb.append(c);
            }
            sb.append(str.substring(1, len-1));
            c = str.charAt(len-1);
            if(c != 'x') {
                sb.append(c);
            }
            return sb.toString();
        }
        else if(len == 1 && str.charAt(0) == 'x') {
            return "";
        }
        else return str;
    }
}
