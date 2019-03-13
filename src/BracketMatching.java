package PCT-Practice;


public class BracketMatching {

    public static void main( String[] arg ) {

        String s = "(the[is]{valid})";
        int charOut1 = s.replaceAll("[^(]" , "").length();
        int charOut2 = s.replaceAll("[^)]" , "").length();

        int charOut3 = s.replaceAll("[*]" , "").length();
        int charOut4 = s.replaceAll("[^]]" , "").length();

        int charOut5 = s.replaceAll("[^{]" , "").length();
        int charOut6 = s.replaceAll("[^}]" , "").length();

        if (charOut1 == charOut2 && charOut3 == charOut4 && charOut5 == charOut6)
            System.out.println("TRUE");

    }

}
