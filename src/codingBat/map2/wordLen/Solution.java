package codingBat.map2.wordLen;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
 */
public class Solution {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;

    }
}
