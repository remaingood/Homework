package codingBat.recursion1.nestParen;
/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.
 */
public class Solution {
    public boolean nestParen(String str) {
        return str.length() == 0 ||
                ('(' == str.charAt(0) && ')' == str.charAt(str.length() - 1))
                        && nestParen(str.substring(1, str.length() - 1));

    }

}
