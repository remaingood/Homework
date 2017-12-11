package codingBat.string2.oneTwo;
/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 */
public class Solution {
    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < str.length(); index += 3) {
            if (index + 2 < str.length()) {
                char front = str.charAt(index);
                String end = str.substring(index + 1, index + 3);
                sb.append(end);
                sb.append(front);
            }
        }

        return sb.toString();

    }

}
