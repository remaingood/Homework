package codingBat.warmup1.frontBack;

/*

Given a string, return a new string where the first and last chars have been exchanged.
 */

public class Solution {
    public String frontBack(String str) {
        String front;
        String middle;
        String back;

        if (str.length() == 0) {
            return str;
        }
        else if (str.length() == 1) {
            return str;
        }
        else if (str.length() == 2) {
            front = str.substring(0,1);
            back = str.substring(1);

            return back + front;
        }

        else {
            front = str.substring(0, 1);
            middle = str.substring(1, str.length() - 1);
            back = str.substring(str.length() - 1);

            return back + middle + front;
        }
    }
}
