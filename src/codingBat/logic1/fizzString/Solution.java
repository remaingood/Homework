package codingBat.logic1.fizzString;
/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 */
public class Solution {
    public String fizzString(String str) {
        StringBuilder builder = new StringBuilder();
        if (str.startsWith("f")) {
            builder.append("Fizz");
        }
        if (str.endsWith("b")) {
            builder.append("Buzz");
        }
        return builder.length() == 0 ? str : builder.toString();

    }

}
