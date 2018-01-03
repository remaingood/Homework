package hackerrank.strings.javaStringReverse;

import java.util.Scanner;

/*
Given a string , print Yes if it is a palindrome, print No otherwise.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(B) ? "Yes" : "No");

    }
}
