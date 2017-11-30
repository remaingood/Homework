package codingBat.warmup2.stringBits;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

 */
public class Solution {
    public String stringBits(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i+=2){
            res = res + str.substring(i, i+1);
        }
        return res;
    }
}
