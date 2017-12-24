package codingBat.ap1.scoresClump;
/*
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 */
public class Solution {
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++){
            if (scores[i + 2] - scores[i] <= 2 ){
                return true;
            }
        }
        return false;

    }

}
