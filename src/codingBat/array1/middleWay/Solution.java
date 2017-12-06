package codingBat.array1.middleWay;
/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 */
public class Solution {
    public int[] middleWay(int[] a, int[] b) {
        int [] newArray = new int[2];
        if (a.length == 3 && b.length == 3) {
            newArray[0] = a[1];
            newArray[1] = b[1];
        }
        return newArray;

    }

}
