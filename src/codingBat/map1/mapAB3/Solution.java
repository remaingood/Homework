package codingBat.map1.mapAB3;

/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
 */

import java.util.Map;

public class Solution {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") == null){
            map.put("b", map.get("a"));
        }
        if(map.get("a") == null && map.get("b") != null){
            map.put("a", map.get("b"));
        }

        return map;

    }

}
