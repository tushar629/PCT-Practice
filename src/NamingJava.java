package PCT-Practice;


import java.util.Scanner;
import java.util.StringTokenizer;

public class NamingJava {

    public static void main( String[] args ) {

        String words;
        Scanner input = new Scanner(System.in);
        words = input.nextLine();
        StringTokenizer st = new StringTokenizer(words);
        if (st.countTokens() == 3) {
            String[] scr = words.split(" ");
            System.out.println(scr[2] + " " + scr[0] + " " + scr[1]);
        }
        if (st.countTokens() == 1) {
            System.out.println(words);
        }
        if (st.countTokens() == 2) {
            String[] scr = words.split("");

            if (scr[scr.length - 1].equalsIgnoreCase("a") ||
                    scr[scr.length - 1].equalsIgnoreCase("e") ||
                    scr[scr.length - 1].equalsIgnoreCase("i") ||
                    scr[scr.length - 1].equalsIgnoreCase("o") ||
                    scr[scr.length - 1].equalsIgnoreCase("u")) {
                String[] scr1 = words.split(" ");
                System.out.println(scr1[1] + " " + scr1[0]);
            } else {
                System.out.println(words);
            }
        }
    }
}
