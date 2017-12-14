package codingBat.recursion1.countAbc;
/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 */
public class Solution {
    public int countAbc(String str) {
        if(str.length() < 3) {
            return 0;
        }
        String s = str.substring(0, 3);
        if(s.equals("abc")) {
            return 1 + countAbc(str.substring(3));
        }
        if(s.equals("aba")) {
            return 1 + countAbc(str.substring(2));
        }
        return countAbc(str.substring(1));

    }

}
