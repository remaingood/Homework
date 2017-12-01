package codingBat.string1.left2;

public class Solution {
    public String left2(String str) {
        String res = "";
        if(str.length() >=2) {
            String first2 = str.substring(0, 2);
            res =  str.substring(2) + first2;
        }
        return res;


    }

}
