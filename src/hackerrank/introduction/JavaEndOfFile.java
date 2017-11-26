package hackerrank.introduction;

/*
The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 */

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}
