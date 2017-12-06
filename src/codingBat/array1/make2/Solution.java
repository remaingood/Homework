package codingBat.array1.make2;
/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
 */
public class Solution {
    public int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];
        if(a.length >= 2){
            newArray[0] = a[0];
            newArray[1] = a[1];
        }
        else if(a.length == 1){
            newArray[0] = a[0];
            newArray[1] = b[0];
        }
        else{
            newArray[0] = b[0];
            newArray[1] = b[1];
        }
        return newArray;

    }

}
