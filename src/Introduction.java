package PCT-Practice;


import java.util.Scanner;

public class Introduction {

    public static void main( String[] args ) {

        int[] arr = new int[5];
        System.out.println("Enter numbers");

        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }
        System.out.println("Array entered is ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
