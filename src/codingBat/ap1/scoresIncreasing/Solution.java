package codingBat.ap1.scoresIncreasing;
/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

 */
public class Solution {
    public boolean scoresIncreasing(int[] scores) {
        if (scores.length >= 2){
            for(int i = 0; i < scores.length - 1; i++){
                if(scores[i+1] < scores[i]){
                    return false;
                }
            }
        }

        return true;

    }

}
