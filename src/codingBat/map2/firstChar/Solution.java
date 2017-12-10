package codingBat.map2.firstChar;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
 */
public class Solution {
    public Map<String, String> firstChar(String[] strings) {
        Map<String,String> map = new HashMap();
        for(String str: strings){
            if (map.get(str.substring(0,1))!= null){
                String value = map.get(str.substring(0,1)) + str;
                map.put(str.substring(0,1),value);
            }else{
                map.put(str.substring(0,1),str);
            }
        }

        return map;


    }

}
