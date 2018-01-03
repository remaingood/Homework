package hackerrank.strings.javaStringTokens;

import java.util.Scanner;

/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().trim().split("[ !,?\\._'@]+", 0);
        if (s.length == 1 && s[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(s.length);
            for (String strings : s) {
                System.out.println(strings);
            }
            scan.close();
        }
    }
}
