package codingBat.warmup1.icyHot;

/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 */
public class Solution {
    public boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100){
            return true;
        }
        else if(temp2 < 0 && temp1 > 100){
            return true;
        }
        else return false;

    }

}
