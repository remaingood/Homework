package codingBat.logic2.makeChocolate;
/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
 */
public class Solution {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal/5;
        if(maxBig <= big) {
            goal -= maxBig * 5;
        }
        else {
            goal -= big * 5;
        }
        if(goal <= small) {
            return goal;
        }
        return -1;

    }

}
