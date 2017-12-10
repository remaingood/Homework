package codingBat.map1.mapAB2;

import java.util.Map;

/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
 */
public class Solution {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;

    }

}
