package codingBat.string3.gHappy;
/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
 */
public class Solution {
    public boolean gHappy(String str) {
        boolean happy = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g'){
                    happy = true;
                }
                else if (i < str.length()-1 && str.charAt(i+1) == 'g') {
                    happy = true;
                }
            else happy = false;
            }
        }
        return happy;

    }

}
