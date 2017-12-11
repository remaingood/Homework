package codingBat.string2.wordEnds;
/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words
 */
public class Solution {
    public String wordEnds(String str, String word) {
        String result = "";
        int length = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                result += ( (i-1) >= 0 ) ? str.charAt(i-1) : "";
                result += ( (i+length) < str.length() ) ? str.charAt(i+length) : "";
            }
        }
        return result;

    }

}
