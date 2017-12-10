package codingBat.logic1.answerCell;
/*
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
 */
public class Solution {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep) {
            return false;
        }
        if(isMom) {
            return true;
        }
        return (!isMorning);

    }

}
