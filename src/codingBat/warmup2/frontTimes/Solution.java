package codingBat.warmup2.frontTimes;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
 */

public class Solution {
    public String frontTimes(String str, int n) {
        int length = 3;
        if (length > str.length()){
            length = str.length();
        }
        String front = str.substring(0, length);
        String res = "";
        if (n > 0){
            for(int i = 0; i < n; i++){
                res = res + front;
            }
        }
        return res;

    }

}
