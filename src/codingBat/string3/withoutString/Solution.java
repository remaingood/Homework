package codingBat.string3.withoutString;
/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */
public class Solution {
    public String withoutString(String base, String remove) {
        String result="";
        int i=0;
        while(i<=(base.length()-remove.length())){
            if(base.substring(i,i+remove.length()).equalsIgnoreCase(remove)){
                i=i+remove.length();
                continue;
            }
            result+=base.charAt(i);
            i++;
        }
        result+=base.substring(i);

        return result;

    }
}
