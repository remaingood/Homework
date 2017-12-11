package codingBat.string3.notReplace;
/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
 */
public class Solution {
    public String notReplace(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))
                    || i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
                result += str.charAt(i);
            }
            else if(i+1 < str.length() && str.substring(i, i+2).equals("is")) {
                result += "is not";
                i++;
            }
            else result += str.charAt(i);
        }
        return result;

    }

}
