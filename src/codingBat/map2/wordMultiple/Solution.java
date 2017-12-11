package codingBat.map2.wordMultiple;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
 */
public class Solution {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        Map<String, Integer> intMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];

            if (intMap.containsKey(s)) {
                int count = intMap.get(s);
                count++;
                intMap.put(s, count);
            } else {
                intMap.put(s, 1);
            }
            map.put(s, intMap.get(s) >= 2);

        }

        return map;
    

    }

}
