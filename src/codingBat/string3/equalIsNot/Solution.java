package codingBat.string3.equalIsNot;
/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */
public class Solution {
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( i+2 <=str.length() && str.substring(i, i + 2).equals("is") ) {
                countIs++;
            }
            if ( i+3<=str.length() &&str.substring(i, i + 3).equals("not"))
                countNot++;
        }
        return countIs == countNot;

    }

}
