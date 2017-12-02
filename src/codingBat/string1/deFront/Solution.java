package codingBat.string1.deFront;
/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it look
 */
public class Solution {
    public String deFront(String str)
    {
        int len = str.length();
        if(len >= 2)
        {
            StringBuilder sb = new StringBuilder(len);
            if(str.charAt(0) == 'a') {
                sb.append('a');
            }
            if(str.charAt(1) == 'b') {
                sb.append('b');
            }
            sb.append(str.substring(2));

            return sb.toString();

        }
        else if(len == 1 && str.charAt(0) == 'a') {
            return "a";
        }
        else return "";
    }
}
