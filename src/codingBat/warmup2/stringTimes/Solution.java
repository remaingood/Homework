package codingBat.warmup2.stringTimes;


/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */

public class Solution {
    public String stringTimes(String str, int n) {
        String res = "";
        if (n > 0){
            for(int i = 0; i < n; i++){
                res += str;
            }
        }
        return res;

    }

}
