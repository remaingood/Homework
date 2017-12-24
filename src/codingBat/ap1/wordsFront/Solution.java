package codingBat.ap1.wordsFront;
/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
 */
public class Solution {
    public String[] wordsFront(String[] words, int n) {
        String[] updatedWords = new String[n];
        for (int i = 0; i < updatedWords.length; i++){
            updatedWords[i] = words[i];
        }
        return updatedWords;

    }

}
