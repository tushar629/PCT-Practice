package PCT-Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListElements {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<ArrayList<Integer>> rowsOfRow = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int noOfRows = input.nextInt();
            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j < noOfRows; j++) {
                rows.add(input.nextInt());
            }
            rowsOfRow.add(rows);
        }

        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int row = input.nextInt();
            int column = input.nextInt();
            try {
                System.out.println(rowsOfRow.get(row - 1).get(column - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}