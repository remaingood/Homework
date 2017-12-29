package codingBat.ap1.commonTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
 */
public class Solution {
    public int commonTwo(String[] a, String[] b) {
        Set<String> aSet = new HashSet<>(Arrays.asList(a));
        Set<String> bSet = new HashSet<>(Arrays.asList(b));

        int number = 0;
        for (String element : aSet) {
            number = bSet.contains(element) ? ++number : number;
        }

        return number;

    }

}
