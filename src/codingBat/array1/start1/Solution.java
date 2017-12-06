package codingBat.array1.start1;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
 */
public class Solution {
    public int start1(int[] a, int[] b) {
        int first = 0;
        if(a.length >= 1 && a[0] == 1) {
            first += 1;
        }
        if(b.length >= 1 && b[0] == 1) {
            first += 1;
        }
        return first;

    }

}
