package codingBat.string2.repeatFront;
/*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 */
public class Solution {
    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder((n*n + n)/2);
        for(int i = n; i >= 1; i--){
            for(int j = 0; j < i; j++)
                sb.append(str.charAt(j));
        }
        return sb.toString();

    }

}
