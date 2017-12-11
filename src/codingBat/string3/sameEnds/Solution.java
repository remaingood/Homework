package codingBat.string3.sameEnds;
/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 */
public class Solution {
    public String sameEnds(String string) {
        String result="";
        for(int i=0;i<string.length()/2+1;i++){
            if(string.substring(0,i).equals(string.substring(string.length()-i))) {
                result = string.substring(0, i);
            }
        }
        return result;

    }
}
