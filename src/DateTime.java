package PCT-Practice;


import java.io.*;
import java.util.*;

class Result {

    public static String findDay( int month , int day , int year ) {

        Calendar cal = Calendar.getInstance();
        cal.set(year , month - 1 , day);
        int days = cal.get(Calendar.DAY_OF_WEEK);
        String[] DAY = { "SUNDAY" , "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY" };
        return (DAY[days - 1]);
    }
}

public class DateTime {
    public static void main( String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$" , "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String result = Result.findDay(month , day , year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
