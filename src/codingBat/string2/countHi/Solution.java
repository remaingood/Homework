package codingBat.string2.countHi;
/*
Return the number of times that the string "hi" appears anywhere in the given string.
 */
public class Solution {
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1 ; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                count++;
        }
        return count;
    }
}
