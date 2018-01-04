package hackerrank.dataStructures.javaSubarray;

import java.util.Scanner;

/*
Given an array of  integers, find and print its number of negative subarrays on a new line.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        System.out.println(negativeSubarrays(array));
    }

    private static int negativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
