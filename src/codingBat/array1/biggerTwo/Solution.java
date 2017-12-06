package codingBat.array1.biggerTwo;
/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
 */
public class Solution {
    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        if (aSum == bSum){
            return a;
        }

        return aSum > bSum ? a : b;


    }
}
