package hackerrank.introduction;

/*
You are given a date. To simplify your task, we have provided a portion of the code in the editor. You just need to write the method, getDay, which returns the day on that date.

For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

Constraints

2000 < year < 3000

Output Format

Output the correct day in capital letters.
 */



import java.util.Calendar;
import java.util.Scanner;


public class JavaDateAndTime {
    public static String getDay(String day, String month, String year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int wDay = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeek[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return(dayOfWeek[wDay-1]);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}

