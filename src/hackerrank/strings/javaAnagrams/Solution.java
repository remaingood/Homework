package hackerrank.strings.javaAnagrams;


import java.util.HashMap;
import java.util.Map;

/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
 */
public class Solution {
    static boolean isAnagram(String a, String b) {
        if( a == null || b == null || a.equals("") || b.equals("") )
            throw new IllegalArgumentException();

        if ( a.length() != b.length() )
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < b.length(); k++){
            char letter = b.charAt(k);

            if( ! map.containsKey(letter)){
                map.put( letter, 1 );
            } else {
                Integer frequency = map.get( letter );
                map.put( letter, ++frequency );
            }
        }


        for (int k = 0; k < a.length(); k++){
            char letter = a.charAt(k);

            if( ! map.containsKey( letter ) )
                return false;

            Integer frequency = map.get(letter);

            if(frequency == 0 )
                return false;
            else
                map.put( letter, --frequency);
        }

        return true;



    }


}
