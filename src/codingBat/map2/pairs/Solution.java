package codingBat.map2.pairs;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
 */
public class Solution {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String array = strings[i];
            String first = String.valueOf(array.charAt(0));
            String last = String.valueOf(array.charAt(array.length() - 1));
            map.put(first, last);


        }
        return map;

    }

}
