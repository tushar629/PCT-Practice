package PCT-Practice;


import java.util.*;

class DataType {
    public static void main( String[] arg ) {
        Scanner input = new Scanner(System.in);
        int totalNumbers = input.nextInt();

        for (int i = 0; i < totalNumbers; i++) {
            try {
                long number = input.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= -128 && number <= 127) System.out.println("* byte");
                if (number >= -32768 && number <= -32767) System.out.println("* short");
                if (number >= -Math.pow(2 , 31) && number <= Math.pow(2 , 31) - 1) System.out.println("* int");
                if (number >= -Math.pow(2 , 63) && number <= Math.pow(2 , 63) - 1) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(input.next() + " can not be fitted anywhere.");
            }
        }
    }
}




