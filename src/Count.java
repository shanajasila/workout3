import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Count {
    public static int wordcount(String Count, int ct) {
        int wc = 1;
        for (int i = 0; i <ct; i++) {

            if ((Count.charAt(i) == ' ') || (Count.charAt(i) == '\t') || (Count.charAt(i) == '\n')) {
                wc++;
            }
        }
        return wc;
    }

    public static int vowelcount(String Count,int ct) {
        int vc = 0;
        for (int i = 0; i <ct; i++) {
            if ((Count.charAt(i) == 'a') || (Count.charAt(i) == 'e') || (Count.charAt(i) == 'i') || (Count.charAt(i) == 'o') || (Count.charAt(i) == 'u')) {
                vc++;
            }
        }
        return vc;
    }

    public static int linecount(String Count,int ct) {
        int lc = 1;
        for (int i = 0; i < ct; i++) {
            if ((Count.charAt(i) == '\n')) {
                lc++;
            }
        }
        return lc;

    }

    public static void main(String args[]) {
        System.out.println("please enter the number of string you want to enter");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
         String st=sc.nextLine();
        int  ct=st.length();
        System.out.println("the word count is"+wordcount(st,ct));
        System.out.println("the vowel count is"+vowelcount(st,ct));
       System.out.println("the line count is"+linecount(st,ct));
    }
}

