package PCT-Practice;


import java.util.Scanner;

public class Matrix {
    public static void main( String[] arg ) {
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
