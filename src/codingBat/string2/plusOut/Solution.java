package codingBat.string2.plusOut;
/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
 */
public class Solution {
    public String plusOut(String str, String word) {
        if(str.contains(word)){
            str=str.replace(word,"--");
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!='-') {
                    str = str.replace(str.substring(i, i + 1), "+");
                }
            }
        }
        str = str.replace("--",word);
        return str;
    }

}
