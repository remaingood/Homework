package codingBat.map2.wordAppend;

import java.util.HashMap;
import java.util.Map;

/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
 */
public class Solution {
    public String wordAppend(String[] strings) {
        String result="";
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int i = 0;
            if (map.containsKey(s)) {
                i = map.get(s) + 1;
                map.put(s, i);
                if (i % 2==0) {
                    result += s;
                }
            } else {
                map.put(s, i+1);
            }

        }

        return result;
    }


}
