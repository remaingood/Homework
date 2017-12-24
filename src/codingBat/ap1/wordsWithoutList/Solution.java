package codingBat.ap1.wordsWithoutList;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
 */
public class Solution {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != len) {
                list.add(words[i]);
            }
        }

        return list;

    }

}
