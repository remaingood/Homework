package hackerrank.bigNumber.javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bi1 = new BigInteger(sc.next());
        BigInteger bi2 = new BigInteger(sc.next());

        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
    }
}
