package codingBat.string2.repeatSeparator;
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
 */
public class Solution {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(count*word.length()+sep.length()*(count-1));
        for(int i = 1; i < count; i++){
            sb.append(word);
            sb.append(sep);
        }
        sb.append(word);
        return sb.toString();

    }
}
