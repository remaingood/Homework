package hackerrank.exceptionHandling.javaExceptionHandlingTryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            int l1 = Integer.parseInt(br.readLine());
            int l2 = Integer.parseInt(br.readLine());

            System.out.println( l1 / l2 );

        } catch( IOException e ) {
            e.printStackTrace();
        } catch( NumberFormatException e ) {
            System.out.println("java.util.InputMismatchException");
        } catch( ArithmeticException e ) {
            System.out.println(e.toString());
        }
    }
}
