package codingBat.map1.mapAB4;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
 */

import java.util.Map;

public class Solution {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") != null) {
            if (map.get("a").length() > map.get("b").length()) {
                map.remove("c");
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()) {
                map.remove("c");
                map.put("c", map.get("b"));
            } else if (map.get("a").length() == map.get("b").length()) {
                map.remove("a");
                map.remove("b");
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
