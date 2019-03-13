package PCT-Practice;


import java.util.*;

public class UniqueWordCount {

    public static void main( String[] arg ) {

        String words;
        Scanner input = new Scanner(System.in);
        words = input.nextLine();
        String[] scr = words.split(" ");

        List<String> list = Arrays.asList(scr);
        Set<String> unique = new HashSet<>(list);

        System.out.println("Collections" + unique.size());
    }
}
