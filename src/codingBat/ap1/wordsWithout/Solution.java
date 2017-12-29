package codingBat.ap1.wordsWithout;
/*
Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
 */
public class Solution {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals(target)) {
                count++;
            }
        }

        String[] array = new String[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(!words[i].equals(target)) {
                array[index] = words[i];
                index++;
            }
        }

        return array;

    }

}
