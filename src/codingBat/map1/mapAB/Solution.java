package codingBat.map1.mapAB;

import java.util.Map;

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
 */
public class Solution {
    public Map<String, String> mapAB(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", a + b);
        }
        return map;

    }

}
