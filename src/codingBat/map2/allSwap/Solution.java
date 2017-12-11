package codingBat.map2.allSwap;

import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
 */
public class Solution {
    public String[] allSwap(String[] strings) {
        final Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                continue;
            }
            final Character firstChar = strings[i].charAt(0);
            final Integer potentialIndex = map.remove(firstChar);

            if (potentialIndex != null) {
                final int thatIndex = potentialIndex;
                final String temp = strings[thatIndex];
                strings[thatIndex] = strings[i];
                strings[i] = temp;
            } else {
                map.put(firstChar, i);
            }
        }

        return strings;

    }

}
