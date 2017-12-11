package codingBat.string2.repeatEnd;
/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 */
public class Solution {
    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder(n*n);
        String end = str.substring(str.length()-n);
        for(int i = 0; i < n; i++) {
            sb.append(end);
        }
        return sb.toString();

    }

}
