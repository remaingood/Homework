package codingBat.string1.withoutX2;
/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 */
public class Solution {
    public String withoutX2(String str) {
        int len = str.length();
        if(len >= 2){
            char c = str.charAt(0);
            StringBuilder sb = new StringBuilder(len);
            if(c != 'x') {
                sb.append(c);
            }
            c = str.charAt(1);
            if(c != 'x') {
                sb.append(c);
            }
            sb.append(str.substring(2));
            return sb.toString();
        }
        else if(len == 1 && str.charAt(0) == 'x') {
            return "";
        }
        else return str;
    }

}
