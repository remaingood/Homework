package codingBat.string1.startWord;

/*
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 */

public class Solution {
    public String startWord(String str, String word){
        int lenStr = str.length();
        int lenWord = word.length();
        String temp;
        if(lenStr >= lenWord)
        {
            temp = str.substring(1, lenWord);
            if(word.substring(1).equals(temp)) {
                return (str.charAt(0) + temp);
            }
            else return "";
        }
        else return "";
    }

}
