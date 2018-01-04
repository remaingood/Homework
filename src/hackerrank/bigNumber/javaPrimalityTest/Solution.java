package hackerrank.bigNumber.javaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

/*
A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
        // Write your code here.
    }
}
