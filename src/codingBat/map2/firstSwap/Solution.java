package codingBat.map2.firstSwap;

import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
 */
public class Solution {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if(!map.containsKey(key)){
                map.put(key, i);
            } else if(!map.get(key).equals(-1)){
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;
                map.put(key, -1);
            }
        }
        return strings;

    }

}
